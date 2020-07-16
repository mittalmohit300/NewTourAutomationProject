package com.newtour.testpages;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.newtour.pages.NewTourSupportPage;
import com.newtour.testbase.TestBase;

public class NewTourSupportTest extends TestBase {
	NewTourSupportPage supportpage;
	
	public NewTourSupportTest() {
		super();
	}

	@BeforeMethod
	public void newsupportset() {
		initialization();
		supportpage=new NewTourSupportPage();
	}
	
	@Test
	public void supporttest() {
		supportpage.clickonsupport();
	}
	
	
	@AfterMethod
	public void teaarDown() {
		driver.quit();
	}
	
}
