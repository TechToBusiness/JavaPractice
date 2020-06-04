package com.dataprovider.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.eclipse.jetty.util.PathWatcher.Config;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dataprovider.base.TestBase;
import com.dataprovider.objectrepository.FlightSearchPage;
import com.dataprovider.util.Util;



public class FlightTest extends TestBase {
	public String inputFilePath;
	public String inputSheet;
	public WebDriver driver;
	
	@BeforeTest
//	super;
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\WebDrivers\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get("https://www.makemytrip.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
	}
	
	@DataProvider
	public Iterator<Object[]> getInputData()
	{
		Properties prop= new Properties();

		FileInputStream FS;
		try {
			FS = new FileInputStream("C:\\Selenium\\Learning\\TestNGProject\\TestNGFirstPractise\\src\\main\\java\\com\\dataprovider\\config\\config.properties");
			try {				prop.load(FS);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		ArrayList<Object[]> testData= Util.getDataFromSheet(prop.getProperty("filePath"), prop.getProperty("sheetName"));
		return testData.iterator();
	}
	
	@Test (dataProvider = "getInputData")
//	FlightSearchPage FSP = new FlightSearchPage();
	public void searchFlight(String fromCity, String toCity, String travelDate, String adultTravellerCount, String childrenTravellerCount)
	{
		FlightSearchPage FSP= new FlightSearchPage();
		PageFactory.initElements(driver, FSP);
		FSP.fromCityClick.click();
		FSP.fromCity.clear();
		FSP.fromCity.sendKeys(fromCity);
		FSP.firstOption.click();
		
		FSP.toCityClick.click();
		FSP.toCity.clear();
		FSP.toCity.sendKeys(toCity);
		FSP.firstOption.click();
		
		
		FSP.travelClass.click();
		driver.findElement(By.xpath("//p [contains(text(),'ADULTS (12y +)')]/following-sibling::ul[1]//li [contains(text(),'"+ adultTravellerCount +"')]")).click();
		
		driver.findElement(By.xpath("//p [contains(text(),'CHILDREN (2y - 12y )')]/following-sibling::ul[1]//li [contains(text(),'"+ childrenTravellerCount +"')]")).click();
		
		FSP.applyTravellerSelection.click();
		
		
		FSP.searchFlights.click();
		
		
		while (!FSP.tripType.isDisplayed())
		{
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		FSP.flightLink.submit();
		
	}
	
	
}