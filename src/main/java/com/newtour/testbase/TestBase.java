package com.newtour.testbase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import com.newtour.utility.TestBaseUtil;
import com.newtour.utility.WebEventListener;


public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	public static EventFiringWebDriver e_driver;
	public static WebEventListener eventListener;
	 
public TestBase() {
		
		prop= new Properties();
		
		try {
			FileInputStream file = new FileInputStream("D:\\D Drive\\Mohit\\WorkSpace_Mohit\\NewTour\\"
					+ "src\\main\\java\\com\\newtour\\config\\config.properties");
			prop.load(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	public static void initialization()
	{
		
	String browsername=prop.getProperty("browser");
	
	if (browsername.equals("chrome")) {

		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\mohit.mittal.cog\\Desktop\\Work\\chromedriver.exe");
		driver = new ChromeDriver();
	} else if (browsername.equals("firefox"))

	{
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\mohit.mittal.cog\\Desktop\\Work\\chromedriver.exe");
		driver = new FirefoxDriver();
	}
	
	e_driver = new EventFiringWebDriver(driver);
	// Now create object of EventListerHandler to register it with EventFiringWebDriver
	eventListener = new WebEventListener();
	e_driver.register(eventListener);
	driver = e_driver;	
		
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(TestBaseUtil.pageloadwait, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(TestBaseUtil.implicitloadwait,TimeUnit.SECONDS);
	driver.get(prop.getProperty("url"));
}
}
