package pratice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class MOCKDISSCUSSION {
	
		
		
		public static void main(String[] args) throws IOException {
		Properties prop = new Properties();
			
		FileInputStream fis = new FileInputStream("C:\\Users\\Hp\\eclipse-workspace\\selenium\\src\\pratice\\config.properties");
		
		prop.load(fis);
		
		String urlvalue = prop.getProperty("url");
		
		System.out.println(urlvalue);
		
		String usernamevalue = prop.getProperty("username");
		
		System.out.println(usernamevalue);
		
		
		}
	

	}
