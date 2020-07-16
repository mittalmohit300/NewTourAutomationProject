package com.newtour.testpages;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.newtour.pages.NewTourContactPage;
import com.newtour.testbase.TestBase;

public class NewTourContactTest extends TestBase {
	
	NewTourContactPage contactpage;

	public NewTourContactTest() {
		super();
	}
	
	
	@BeforeMethod
	public void setup() {
		initialization();
			contactpage=new NewTourContactPage();
					
	}
	
	@Test
	public void contact() {
		contactpage.clickoncontact();
			
	}
	@AfterMethod
	public void teaarDown() {
		driver.quit();
	}
	
}
