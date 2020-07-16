package com.newtour.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.newtour.testbase.TestBase;

public class NewTourContactPage extends TestBase {
	
@FindBy(xpath="//a[contains(text(),'CONTACT')]")
WebElement contact;	
	
	
	public NewTourContactPage() {
		PageFactory.initElements(driver, this);
		
	}
	
	public void clickoncontact() {
		contact.click();		
	}

}
