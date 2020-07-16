package com.newtour.testpages;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.newtour.pages.NewTourRegisterPage;
import com.newtour.testbase.TestBase;
import com.newtour.utility.NewTourTestData;


public class NewTourRegisterTestPage extends TestBase{

	NewTourRegisterPage reg;
	String sheetname="Registration";
	

	public NewTourRegisterTestPage() {
		super();
	}
	
	
	@BeforeMethod
	public void setupregister() {
		initialization();
			reg=new NewTourRegisterPage();
					
	}
	
	@DataProvider 
	public Object[][] testdata(){
		Object data[][]=NewTourTestData.getTestData(sheetname);
		return data;
		
		}
	@Test(priority=1,dataProvider="testdata")
	public void verifyregistration(String FirstName, String LastName, 
			String Phone, String Email, String Address, String City, String State, String PostalCode ) {
		
		reg.clickonregister();
		reg.registarionpage(FirstName, LastName, Phone, Email, Address, City, State, PostalCode);}
			
	

	@AfterMethod
	public void teaarDown() {
		driver.quit();
	}
	
}
