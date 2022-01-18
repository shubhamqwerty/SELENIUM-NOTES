package actionclassdiscussion;

import java.io.IOException;

import utility.ReadConfigData;

public class ReadDataFromConfig {
	
	
	public static void main(String[] args) throws IOException
	{
	System.out.println(ReadConfigData.getDataFromConfig("url"));	
	
	System.out.println(ReadConfigData.getDataFromConfig("password"));	
	
	
	}

}
