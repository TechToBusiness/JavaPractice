package com.mmt.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mmt.qa.base.TestBase;

public class SignupPage extends TestBase {

	//OR Factory
	
	@FindBy(xpath="//div//p [text()=' Login or Create Account']")
	WebElement gotoLoginOrSignUpLink;
	
	@FindBy(xpath="//a [text()=' Create New Account ']")
	WebElement createAccount;
	
	@FindBy(xpath="//input [@placeholder='Enter email or phone no.' and @type='text']")
	WebElement newUserEmail;
	
	@FindBy(xpath="//input [@id='password' and @placeholder='Enter password']")
	WebElement newUserPassword;
	
	@FindBy(xpath="//button [@type='submit']")
	WebElement newUserSubmit;
	
	public SignupPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void newUserRegistration(String newUserName, String newUserPassword)
	{
		gotoLoginOrSignUpLink.click();
		
		createAccount.click();
		
		newUserEmail.sendKeys(newUserName);
		
		this.newUserPassword.sendKeys(newUserPassword);
		
		newUserSubmit.click();
		
		try {
			Thread.sleep(150);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		createAccount.click();
	}
}
