package com.parameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class ParameterTest {
	
	WebDriver driver;
	@Test 
	@Parameters({"url","loginId"})
	public void yahooLogin(String url, String loginId)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium\\\\WebDrivers\\\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		driver.get(url);
		WebElement login= driver.findElement(By.xpath("//input [@id='login-username']"));
		login.clear();
		login.sendKeys(loginId);
		WebElement nextButton= driver.findElement(By.xpath("//input [@id='login-signin']"));
		nextButton.submit();	}
}
