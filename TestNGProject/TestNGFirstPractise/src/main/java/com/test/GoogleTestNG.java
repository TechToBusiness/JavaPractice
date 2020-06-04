package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTestNG {
	WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\WebDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	}
	
	@Test (priority=1, groups="1st one")
	public void atTest1()
	{
//		driver.getTitle();
		System.out.println("Title is " + driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "Choogle", "This is Failing");
	}
	

	@Test (priority=2, groups="1st one", invocationCount =2, expectedExceptions = {java.lang.ArithmeticException.class,org.openqa.selenium.NoSuchElementException.class})
	public void atTest2()
	{
		boolean imageDisp = driver.findElement(By.xpath("//a//img [1]")).isDisplayed();
		System.out.println("Image Displayed is " + imageDisp );
		int i=9/0;
	}
	

	@Test (priority=3, groups="1st one", dependsOnMethods = "atTest2", invocationCount =2, timeOut = 9)
	public void atTest3()
	{
		boolean gSearchDisp = driver.findElement(By.xpath("//input [@value='Google Search' and @aria-label='Google Search' and @type='submit']")).isDisplayed();
		System.out.println("Google Search Displayed " + gSearchDisp);
	}
	
	
	@Test (priority=4, groups="2nd one")
	public void atTest4()
	{
		boolean gSearchDisp = driver.findElement(By.xpath("//input [@value='Google Search' and @aria-label='Google Search' and @type='submit']")).isDisplayed();
		System.out.println("Google Search Displayed " + gSearchDisp);
	}
	
	
	@Test (priority=5 , groups="2nd one")
	public void atTest5()
	{
		boolean gSearchDisp = driver.findElement(By.xpath("//input [@value='Google Search' and @aria-label='Google Search' and @type='submit']")).isDisplayed();
		System.out.println("Google Search Displayed " + gSearchDisp);
	}
	
	
	@Test (priority=6, groups="2nd one")
	public void atTest6()
	{
		boolean gSearchDisp = driver.findElement(By.xpath("//input [@value='Google Search' and @aria-label='Google Search' and @type='submit']")).isDisplayed();
		System.out.println("Google Search Displayed " + gSearchDisp);
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}



//	//img [contains(text(), 'World Cup 2019 - Day 1') and @xpath='1']