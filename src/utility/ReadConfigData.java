package utility;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfigData {
	
	public static void main(String[] args) throws IOException 
	{
		Properties prop = new Properties();
		
		// to read the data of any file we make the object of FileInputSream
	
		FileInputStream fis = new FileInputStream("C:\\Users\\Hp\\eclipse-workspace\\selenium\\config.properties"); //path is of config.proprtiesfile

		prop.load(fis); //load is a method which accepts the object of input 
	
	String urlvalue = prop.getProperty("url");
	
	System.out.println(urlvalue);
	
	String usernamevalue = prop.getProperty("username");
	
	System.out.println(usernamevalue);
	
	}
	
	
public static String getDataFromConfig(String keyvalue) throws IOException
{    
	Properties prop = new Properties();


FileInputStream fis = new FileInputStream("C:\\Users\\Hp\\eclipse-workspace\\selenium\\config.properties"); //path is of config.proprtiesfile

prop.load(fis); 

  String actualvalue = prop.getProperty(keyvalue);
  
  return actualvalue;

	
}






}
//note---> through system.dir we get the projct path