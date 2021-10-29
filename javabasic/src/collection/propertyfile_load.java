package collection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.util.Properties;

public class propertyfile_load {

	public static void main(String[] args) throws IOException {
		
		/**
		 * 1.get the property file location
		 * 2.create an instance of property class
		 * 3.call load method of property class and pass of file location
		 * 4.using property class ref call getproperty(string key) which will return data from key past
		 */

		FileInputStream fis=new FileInputStream("E:\\Software Testing\\Java\\Workspace\\javabasic\\src\\collection\\testdata.properties");
		//FileInputStream fis=new FileInputStream("./testdata.properties");
	   Properties prop=new Properties();
	   prop.load(fis);
	 
	   String appUrl = prop.getProperty("appUrl");
	  System.out.println(appUrl);
	  // System.out.println(prop.getProperty("appUrl"));
		
	   //String username = prop.getProperty("username");
	  // System.out.println(username);
	  // System.out.println(prop.getProperty("username"));	
		
	}

}
