package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LogInPage;

public class LoginPageTest extends TestBase {
	LogInPage logInPage;
	HomePage homePage;
	
	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		 logInPage=new LogInPage();
	}
	
	@Test(priority=1)
	public void loginPageTitleTest() {
	  String title=	logInPage.validateloginPageTitle();
	  Assert.assertEquals(title, "");
	}
	
	
	
	@Test(priority=2)
	public void  logoImageTest() {
	boolean flag =	logInPage.validateImage();
    Assert.assertTrue(flag);
	}
	
	@Test(priority=3)
	public void loginTest() {
    homePage=logInPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
