package mavenprofile1.mavenprofile1;

import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.util.Enumeration;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
	
	private static Pattern fileNamePattern = Pattern.compile("([app-].*(dev|prod|uat)(\\.)(properties))");
	
	public static boolean validateFileExtn(String userName) {
        Matcher mtch = fileNamePattern.matcher(userName);
        if(mtch.matches()){
            return true;
        }
        return false;
    }
	
	public static String getFileName() throws Exception {
		
//		String currentDir = new java.io.File(".").toURI().toString();
//		// AClass = A class in this package
//		String pathToClass = App.class.getResource("/").toString();
//		String packagePath = (pathToClass.substring(currentDir.length() - 2));
//
//		String file;
//		File folder = new File(packagePath);
//		File[] filesList= folder.listFiles(); 
//
//		for (int i = 0; i < filesList.length; i++) 
//		{
//		  if (filesList[i].isFile()) 
//		  {
//		    file = filesList[i].getName();
//		    System.out.println("FIle--------->"+file);
//		    if (file.endsWith(".txt") || file.endsWith(".TXT"))
//		    {
//		      // DO YOUR THING WITH file
//		    }
//		  }
//		}
		
		
		
		
		
		
		
		
		
		
		String myUrl = App.class.getResource("").getPath();
		System.out.println("MY URL :::"+myUrl);
		String filePath = App.class.getResource("").getFile();
		System.out.println("MY FilePath :::"+filePath);
		String classPath = System.getProperty("java.class.path");
		System.out.println("Classpath :::"+classPath);
		String fileName = null;
//		Test.class.getClassLoader().getResources(name)
//		Enumeration<URL> roots = ClassLoader.getSystemClassLoader().getResources("");
//		System.out.println("____________________________________");
//		URL url1 = Test.class.getResource("app-uat.properties");
//		
//		File file = new File(url1.getFile());
//		if( file.exists()) {
//			System.out.println("Exists");
//		}
//		else {
//			System.out.println("No");
//		}
		
		
		
		
		
		
		
		Enumeration<URL> roots = Test.class.getClassLoader().getResources(".");
//		Enumeration<URL> roots = App.class.getClassLoader().getResources(classPath);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~"+roots.hasMoreElements());
		while( roots.hasMoreElements()) {
			URL url = roots.nextElement();
			System.out.println("----->"+url);
			
			File files = new File(url.getFile());
			String[] fileNames = files.list();
			for(String s : fileNames) {
				System.out.println("==========="+s);
				if(validateFileExtn(s)) {
					fileName = s;
					return fileName;
				}
					
			}
		}
		
		
		return fileName;
	}
	
	public static void readConfiPropertiesFile() throws Exception {
		
		File dir = new File("./");
		System.out.println("Path Name :::"+dir.getAbsolutePath());
		
		InputStream in = Test.class.getResourceAsStream("/app-dev.properties");
//		ClassLoader.getSystemResourceAsStream(name);
//		sun.misc.Launcher.getBootstrapClassPath();
//		InputStream in = ClassLoader.getSystemResourceAsStream("/app-dev.properties");
		System.out.println(in);
		System.out.println(Test.class.getResource("").getPath());
		String rootPath = Test.class.getResource("").getFile();
		System.out.println(rootPath);
		
		Enumeration<URL> roots = ClassLoader.getSystemClassLoader().getResources("");
		while( roots.hasMoreElements()) {
			URL url = roots.nextElement();
			System.out.println("----->"+url);
		}
		
		File file = new File(rootPath+File.separator+"app-dev.properties");
		if( file.exists()) {
			System.out.println("Exists");
		}
		else {
			System.out.println("No");
		}
		
	}

	public static void main(String[] args) throws Exception {
		
//		readConfiPropertiesFile();
		System.out.println("=====================================");
		System.out.println(getFileName());
		System.out.println("=====================================");
	}

}
