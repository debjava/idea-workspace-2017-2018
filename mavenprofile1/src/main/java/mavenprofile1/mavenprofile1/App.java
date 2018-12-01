package mavenprofile1.mavenprofile1;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App 
{
	
private static List<String> propsList = new ArrayList<String>();
	
	static {
		propsList.add("app-dev.properties");
		propsList.add("app-uat.properties");
		propsList.add("app-prod.properties");
	}
	
	private static Pattern fileExtnPtrn = Pattern.compile("([app-].*(dev|prod|uat)(\\.)(properties))");
    
    public static boolean validateFileExtn(String userName) {
        Matcher mtch = fileExtnPtrn.matcher(userName);
        if(mtch.matches()){
            return true;
        }
        return false;
    }
     
    public static void main(String a[]){
    	
    	System.out.println("app-prod.properties----->"+validateFileExtn("app-prod.properties"));
    	System.out.println("app-dev.properties----->"+validateFileExtn("app-dev.properties"));
    	System.out.println("app-uat.properties----->"+validateFileExtn("app-uat.properties"));
    	System.out.println("app-check.properties----->"+validateFileExtn("app-check.properties"));
    	System.out.println("config.properties----->"+validateFileExtn("config.properties"));
    	
    	
    	
//        System.out.println("Is 'app-java2novice.pdf' allowed file? "
//                        +validateFileExtn("app-java2novice.pdf"));
//        System.out.println("Is 'app-cric.doc' allowed file? "
//                        +validateFileExtn("app-cric.doc"));
//        System.out.println("Is 'java.properties' allowed file? "
//                        +validateFileExtn("java.properties"));
//        System.out.println("Is 'novice.mp3' allowed file? "
//                        +validateFileExtn("novice.mp3"));
//        System.out.println("Is 'app-java_2.properties' allowed file? "
//                        +validateFileExtn("app-java_2.properties"));
//        System.out.println("Is 'app-prod.properties' allowed file? "
//                +validateFileExtn("app-prod.properties"));
    }
}
