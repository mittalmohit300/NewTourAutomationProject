package com.newtour.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.newtour.testbase.TestBase;


public class NewTourRegisterPage extends TestBase {
	
	@FindBy(xpath="//a[contains(text(),'REGISTER')]")
	WebElement register;
	
	@FindBy(xpath="//input[@name='firstName']")
	WebElement firstname;

	@FindBy(xpath="//input[@name='lastName']")
	WebElement lastname;
	@FindBy(xpath="//input[@name='phone']")
	WebElement phone;
	@FindBy(xpath="//input[@id='userName']")
	WebElement email;
	@FindBy(xpath="//input[@name='address1']")
	WebElement address;
	@FindBy(xpath="//input[@name='city']")
	WebElement city;
	@FindBy(xpath="//input[@name='state']")
	WebElement state;
	@FindBy(xpath="//input[@name='postalCode']")
    WebElement postalcode;
	
public NewTourRegisterPage() {
	PageFactory.initElements(driver, this);
	
}

public void clickonregister() {
	
	register.click();
}


public void registarionpage(String fn, String ln, String ph, String em, String ad, String c, String s, String pc)
{
	firstname.sendKeys(fn);
	lastname.sendKeys(ln);
	phone.sendKeys(ph);
	email.sendKeys(em);
	address.sendKeys(ad);
	city.sendKeys(c);
	state.sendKeys(s);
	postalcode.sendKeys(pc);
} 

}




