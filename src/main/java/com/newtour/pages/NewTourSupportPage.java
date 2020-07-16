package com.newtour.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.newtour.testbase.TestBase;

public class NewTourSupportPage extends TestBase {
	
	@FindBy(xpath="//a[contains(text(),'SUPPORT')]")
	WebElement support;
	
 public NewTourSupportPage() {
	 PageFactory.initElements(driver, this);
	 
 }
	
 public void clickonsupport() {
	 support.click();	 
 }
	
}
