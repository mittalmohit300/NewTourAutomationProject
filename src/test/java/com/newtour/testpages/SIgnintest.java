package com.newtour.testpages;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.newtour.pages.NewTourSignInPage;
import com.newtour.testbase.TestBase;

public class SIgnintest extends TestBase
{
	
	NewTourSignInPage newsign;
	
	public SIgnintest() 
	{		
		 super();		
	}
	
	@BeforeMethod
	public void setup()
	{
		initialization();
		newsign= new NewTourSignInPage();
}
	

	@Test (priority=1)
		public void verifytitle() 
	{
		String title=newsign.validatepagetitle1();
			Assert.assertEquals(title, "Welcome: Mercury Tours");
	}
	
	@Test (priority=2)

	public void loginsite(){
		newsign.Signin(prop.getProperty("username"),prop.getProperty("password"));
	}
	
	/*@AfterMethod
	public void tearDown() {
		driver.quit();
	}*/
}