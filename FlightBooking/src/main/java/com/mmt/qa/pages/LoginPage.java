package com.mmt.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mmt.qa.base.TestBase;

public class LoginPage extends TestBase {
	//Page Factory - OR
	@FindBy(xpath="//div//p [text()=' Login or Create Account']")
	WebElement gotoLogin;
	
	@FindBy(xpath="//input [@type='text' and @id='username']")
	WebElement username;
	
	@FindBy(xpath="//input [@type='password' and @id='password']")
	WebElement password;
	
	@FindBy(xpath="//button//span [text()='Login']")
	WebElement loginButton;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public HomePage login(String userName, String password)
	{	
		gotoLogin.click();
		username.sendKeys(userName);
		this.password.sendKeys(password);
		loginButton.click();
		return new HomePage();
	}
}
