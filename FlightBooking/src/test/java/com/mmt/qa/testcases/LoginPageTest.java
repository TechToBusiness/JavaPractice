package com.mmt.qa.testcases;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mmt.qa.base.TestBase;
import com.mmt.qa.pages.LoginPage;
import com.mmt.qa.pages.SignupPage;

public class LoginPageTest extends TestBase {
	LoginPage lp;
	SignupPage signUpPage;
	public LoginPageTest(){
		super();
	}
	@BeforeMethod
	public void setup() {
		initialize();
		lp=new LoginPage();
		signUpPage= new SignupPage();
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	@Test
	public void loginPage() {
		signUpPage.newUserRegistration("dummyuser@gmail.com", "ABCDEFGMAI@123");
		lp.login(prop.getProperty("username"), prop.getProperty("password"));
	}

}
