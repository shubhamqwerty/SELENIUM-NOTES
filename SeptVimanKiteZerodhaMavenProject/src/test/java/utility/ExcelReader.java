package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

// to perform operstion on excel we compulsory need apace poi libraries

public class ExcelReader { 
	
	public static void main(String[] args) throws IOException {
		
		File src  = new File("C:\\Users\\Hp\\Desktop\\TestData.xlsx");
		
		//to load that particular location in order to perform the action
		
		FileInputStream fis = new FileInputStream(src);
	
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
	XSSFSheet sh1 = wb.getSheet("TestData"); // test data is the name of the sheet in the excel sheet
	
	String value = sh1.getRow(2).getCell(1).getStringCellValue(); // this will point out the specific cell in excel,, 1 and 2 are the index value ,,// here we have use getstringcalue because we already the type of data present in the cell if we dont know then we can make use of GETCELLTYPE through whuch we can know the type of data peswent in  the cell and ten after we can print the value according to the datat type it may be GETBOOLEANVALUE,GETSTRINGVALUE,GETNUMERICVALUE ACCORDINGLY
		
	System.out.println(value);
	
	//TO READ THE any data type other than string  IN EXCEL SHEET  we use data formatter which convert any data type into string 
	
	DataFormatter df = new DataFormatter();  // dataformatter will convert any data type into the String
	
	String numericstringvalue = df.formatCellValue(sh1.getRow(19).getCell(0));

	System.out.println(numericstringvalue);
	
	String value2 = df.formatCellValue(sh1.getRow(20).getCell(0));
	
	System.out.println(value2);
	
//	String getintvalue = sh1.getRow(19).getCell(0).getStringCellValue(); 
//	
//	System.out.println(getintvalue);
	
	
	                                       //TO GET THE TYPE OF DATA INTHE CELL WE USE GETCELLTYPE
	
	 CellType type = sh1.getRow(19).getCell(0).getCellType(); 
	
	 System.out.println(type);
	 
	 double number = sh1.getRow(19).getCell(0).getNumericCellValue();
	 
	 System.out.println(number);
	 
	 
	// writeData(56,4);//method from same class
	 
	 writeData(8, 1, "shubham");
	}
	
	
	//NOTE--> EXCEL SHET WILL CONSIDER THE BOOLEAN , NMERIC, STRING VALUE AS DIFFERENT
	
	
	                                                  //TO READ DATA FROM EXCEL
	public static String readData(int row , int column, String value) throws IOException
	{
		File src  = new File("C:\\Users\\Hp\\Desktop\\TestData.xlsx");
	
	//to load that particular location in order to perform the action
	
	FileInputStream fis = new FileInputStream(src);

	XSSFWorkbook wb = new XSSFWorkbook(fis);
	
	XSSFSheet sh1 = wb.getSheet("TestData"); 
	
DataFormatter df = new DataFormatter();  
	
	String stringvalue = df.formatCellValue(sh1.getRow(row).getCell(column));

	
		return stringvalue;
	}
	
	
	//TO WRITE DATAT IN THE EXCEL SHEET
	
	public static void writeData(int row, int coloumn,String value) throws IOException
	{
		
		File src  = new File("C:\\Users\\Hp\\Desktop\\TestData.xlsx");
	
	//to load that particular location in order to perform the action
	
	FileInputStream fis = new FileInputStream(src);

	XSSFWorkbook wb = new XSSFWorkbook(fis); // upto this we have just found the file
	
	XSSFSheet sh1 = wb.getSheet("TestData");//upto this we are just accesssing the file (i.e read the file)
	
	File fout = new File("C:\\Users\\Hp\\Desktop\\TestData.xlsx");// through this we are locting the file on which operation(write in the file) is going to be performed
		
	// to perform opratio in the file i.e "write" we make the objct of fileoutputstram
	
	FileOutputStream fos = new FileOutputStream(fout);
	
	sh1.getRow(row).createCell(coloumn).setCellValue(value); //through this we are selecteing thg the cell to be edit
	

	//sh1.createRow(50).createCell(3).setCellValue("new row and new coloumn"); // this will create the new cell which is undefinedS
	
	
	wb.write(fos);// this will save all the operation prform on the file
	
	
	
	}
	
	
	
	
	//note----> TO PERFORM  THE OPERATIO ON AN EMPTY ROW  WE  MAKE USE OF CreateRow
	
	//note----> TO PERFORM  THE OPERATIO ON AN EMPTY cell  WE  MAKE USE OF CreateCell
	
	// if we perform operation of cretecell/createrow on the defined row or column then 1st it will delete the the row/cloumn then it will perform the opertion
	
	//if we want to perform the operation on undefined row/coloumn then we g=have to create it 1st bt createcell/createcoloumn
	
	
	//sh1.getRow(0).getLastCellNum(); ----> this will give the last coloumn of the row
	
	
	
	
	

}
