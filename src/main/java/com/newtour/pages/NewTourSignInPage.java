package com.newtour.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.newtour.testbase.TestBase;

public class NewTourSignInPage extends TestBase {
	
	//object repository
	
	@FindBy(name="userName")	
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//input[@name='login']")
	WebElement signin;
	
	public NewTourSignInPage() {
		
		PageFactory.initElements(driver, this);
				
	}
public String validatepagetitle1() {
	
	String actualtitle= driver.getTitle();
	return actualtitle;
}

public void Signin(String un, String pwd) {
	username.sendKeys(un);
	password.sendKeys(pwd);
	signin.click();
	
	//return new NewTourLoggedIn();
	
	
	
	}

}
