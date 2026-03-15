package excelreadwrite;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//Reading the excel sheet need File Input Stream
public class ExcelReadWriteClass {

	public static void main(String[] args) {

		//To call getExcelData method we need to create object of the class
		
		ExcelReadWriteClass x= new ExcelReadWriteClass();
		
		//If we need to print entire data in excel we need to traverse it using for loop
		//Traversing rows and coloumns which is called as nested for loop
		for(int i=0;i<4;i++) {
			
			//Traversing Rows
			for(int j=0;j<3;j++)
			{
				//Printing the Excel data in console
				System.out.println(x.getExcelData("Sheet1", i, j));
			}
			//System.out.println(" ");
			
			
		}
		//We have already created object of the entire class so need to create it again
		//Already upto 2nd row we have email so 3rd row we write pass
		x.WriteExcelData("Sheet1", 0, 3, "Pass");
		//We cannot call for loop here because we use different message for all students
		x.WriteExcelData("Sheet1", 1, 3, "Pass");
		x.WriteExcelData("Sheet1", 2, 3, "Fail");
		x.WriteExcelData("Sheet1", 3, 3, "Fail");
	}
	
	//Writing the data in Excel sheet
	//Writing the excel sheet we need File Output Stream
	
	//While writing in Excel we dont need to return the data type
	public void WriteExcelData(String Sheetname, int Rownum, int Cellnum, String description)
	{
		//Whenever we need to open the file and we want to do something in it we need FileInputStream also
		//Whether we are writing it or reading it does not matter
		
		//Other method to open FileInputStream
		FileInputStream fis;
		XSSFWorkbook wb;
		
		//other method to open FileInputStream 
		try {
			fis=new FileInputStream("Utils//Sample_Excel.xlsx");
			wb=new XSSFWorkbook(fis);
            XSSFSheet s = wb.getSheet(Sheetname);
			XSSFRow r = s.getRow(Rownum);
			//Whenever we are writing in excel we need to create the cell there
			XSSFCell c=r.createCell(Cellnum);
			//After creating the cell we need to set the cell value
			//This method is used to write the data in excel sheet
			c.setCellValue(description);
			//After Setting the Cell value we need to save the file using FOS
			
			FileOutputStream fos = new FileOutputStream("Utils//Sample_Excel.xlsx");
			//Once it is outputted we need to use fos object to write in workbook
			//It is necessary to save the changes to execl file after writing the data using Apache POI
			wb.write(fos);  //This Method is Important after giving this only we can write
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
         }
		
				
		
	}

	// Writing own method outside main method

	// As we are reading the data we use String value in method

	//We are reading the excel so we need return value of data type
	public String getExcelData(String Sheetname, int Rownum, int Colnum)  {
		//Above method returning the String so String needs the return value
		//We dont know what value before entering into excel so declaring as null
		String retval=null;

		// Whenever we want to read something to excel we want to create object of FileInputStream

		// FileInputStream Always needs file as an argument, In which path excel sheet is present
		
		try {
			//FileInputStream is a class 
			FileInputStream fis = new FileInputStream("Utils//Sample_Excel.xlsx");
			
			// To open the complete work book
			// fis is connection estability from which file we need to open the workbook
			
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			
			// We already opened Workbook so no need to specify new, can directly mention wb object
			// Making this method to be reusable so calling the parameter from the method created
			
			XSSFSheet s = wb.getSheet(Sheetname);
			
			// Getting the row from Sheet, where s is the object of the sheet
			
			XSSFRow r = s.getRow(Rownum);
			
			// To read the cell from row
			
			XSSFCell c = r.getCell(Colnum);
			
			// Getting the value from the cell
			//Whatever the data we are reading we are saving it to retval variable 
			//And that variable we need to return, which is returned after catch block
			//Mentioned method is static so calling class name directly with method
			retval = ExcelReadWriteClass.getCellvalue(c);
			
			//After reading the cell value we should close the workbook
			//Because it is nt the good idea to keep the workbook opened
			//Closing the connection also with the file
			fis.close();
			wb.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
		
		//Instead of handling throws IOException in method we can catch IOexception seprately here
		//Because we need to use calling method if throws is used
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
		//Returning the String variable due to compilation error
		return retval;
		}
	
	//getCellvalue method is use to read the data from Excel sheet
	
	//Writing seprate method for defining what data type it is and depanding on that we will call the according method
	//If we just mention c we dont know where it comes from like from row or sheetname or from column so we are using XSSFCell c
	//If we dont know what data type that excel is using we can go with this method
	//As we are returning the cell value we should not use void and should use any one of the datatype
	public static String getCellvalue(XSSFCell c)
	{
        //Here we can use Switch loop
		//getCellType method will get the what data type it is used
		switch(c.getCellType())
		{
		case NUMERIC :
			//To change into String cell value we should use String.valueOf method
			//We are returning the string so we need to convert Numeric data type to String using this method
			//When Numerical String converts to String it will be written as eg:- 10.0
			return String.valueOf(c.getNumericCellValue());  // Coverts 10 to "10"
			
		case BOOLEAN :
			return String.valueOf(c.getBooleanCellValue());
		case STRING :
			//To read the value of a cell as a string, getStringCellValue method is used
			return c.getStringCellValue(); //Reads strincellvalue from Excel Spreadsheet
		default:
			return c.getStringCellValue();
		}
 }
}
