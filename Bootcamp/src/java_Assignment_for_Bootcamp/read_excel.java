package java_Assignment_for_Bootcamp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class read_excel {

	public static void main(String[] args) throws IOException {
		
		String path= "C:\\Users\\Eclipse Practise\\Bootcamp\\data\\Students.xlsx";
		File xl= new File(path);
		FileInputStream fis= new FileInputStream(xl);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet wbs = wb.getSheetAt(0);
		Row r0= wbs.getRow(0);
		Cell c0 = r0.getCell(0);
		
		System.out.println(c0);
		
		fis.close();

	}

}
