package com.mmt.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.mmt.qa.util.TestUtil;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	public TestBase() 
	{
		try {
			prop= new Properties();
			FileInputStream fileReader;
			
			fileReader = new FileInputStream("C:\\Selenium\\Learning\\FlightBooking\\src\\main\\java\\com\\mmt\\qa\\config\\config.properties");
				prop.load(fileReader);
			
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	public void initialize()
	{
		String browserName= prop.getProperty("browser");
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\WebDrivers\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if (browserName.equals("firefox"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\WebDrivers\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.page_load_timeout, TimeUnit.SECONDS);	
		driver.manage().timeouts().implicitlyWait(TestUtil.implicit_wait, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
	}
}
