package mavenprofile1.mavenprofile1;

import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileReader {

	private static Pattern fileNamePattern = Pattern.compile("([app-].*(dev|prod|uat)(\\.)(properties))");

	public static boolean validateFileExtn(String userName) {
		Matcher mtch = fileNamePattern.matcher(userName);
		if(mtch.matches()){
			return true;
		}
		return false;
	}
	
	private static List<String> propsList = new ArrayList<String>();
	
	static {
		propsList.add("app-dev.properties");
		propsList.add("app-uat.properties");
		propsList.add("app-prod.properties");
	}
	
	public static String getFile() throws Exception {
		InputStream inStream = null;
		String name = null;
		System.out.println("-----------"+propsList);
		for(String fileName : propsList ) {
			System.out.println("FileName :::"+fileName);
			inStream = FileReader.class.getResourceAsStream("/"+fileName);
			if(inStream != null) {
				name = fileName;
				return name;
			}
		}
		return name;
	}

	public static String getFileName() throws Exception {
		String fileName = null;
		Enumeration<URL> roots = FileReader.class.getClassLoader().getResources(".");
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
	
	public static void main(String[] args) throws Exception {
//		System.out.println(getFileName());
		
		System.out.println(getFile());
	}

}
