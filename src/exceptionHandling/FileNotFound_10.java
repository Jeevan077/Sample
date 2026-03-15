package exceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileNotFound_10 {

	public static void main(String[] args) {
		// Whenever we need to read the file we use inbuild method of FileReader
		
		try {
			FileReader filer=new FileReader("Test.txt");
		} catch (FileNotFoundException e) {
			//This will Print every information of exception in the console
			e.printStackTrace();
			
			System.out.println("File does not exists");
		}
		

	}

}
