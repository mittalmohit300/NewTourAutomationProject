package com.newtour.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.newtour.testbase.TestBase;

public class NewTourTestData extends TestBase {

	public static Workbook book;
	public static org.apache.poi.ss.usermodel.Sheet sheet;
	public static String TestData_Sheet_Path="D:\\D Drive\\Mohit\\WorkSpace_Mohit\\NewTour\\src"
			+ "\\main\\java\\com\\newtour\\utility\\NewTourRegistration.xlsx";
	
		public static  Object[][] getTestData(String sheetname) {
		
		FileInputStream file=null;
		try {
			file=new FileInputStream(TestData_Sheet_Path);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			book=WorkbookFactory.create(file);
		} catch (InvalidFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		sheet=book.getSheet(sheetname);
	Object[][] data= new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
	for (int i=0; i<sheet.getLastRowNum(); i++) {
		for(int k=0; k< sheet.getRow(0).getLastCellNum(); k++) {
			data[i][k]= sheet.getRow(i+1).getCell(k).toString();
		}
			}
	
	return data;
		}

		public static void takeScreenshotAtEndOfTest() throws IOException {
			File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			String currentDir = System.getProperty("user.dir");
			FileUtils.copyFile(scrFile, new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png"));
		}

		
}
