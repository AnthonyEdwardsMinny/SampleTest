package jup;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class fileU {
	
		//public static void main(String[] args) throws IOException {
			
		
		public String  getdatafrompropertyjup(String key) throws IOException {
		
		FileInputStream fis= new FileInputStream("./confidata/hrm.properties");
		Properties prop=new Properties();
		prop.load(fis);
		String data=prop.getProperty(key);
		//System.out.println(data);
	return data;
		
	}
	}

