package com.crm.qa.testcases;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LogInPage;
import com.crm.qa.util.TestUtil;

public class HomePageTest extends TestBase{
	LogInPage loginPage;
	HomePage homePage;
	TestUtil testutil;
	ContactsPage contactsPage;
	
	public HomePageTest() {
		
		super();
	}	
		
	@BeforeMethod
	public void setUp() {
		initialization();
		testutil= new TestUtil();
		 loginPage=new LogInPage();
		 contactsPage=new ContactsPage();
		 homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	@Test(priority=2)
	public void verifyUserNameTest() {
		testutil.switchToFrame();
		Assert.assertTrue( homePage.verifyCorrectUserName());		
	}
	
	@Test(priority=1)
	public void verifyHomePageTitleTest() {
		String homePageTitle= homePage.verifyHomePageTitle();
		Assert.assertEquals(homePageTitle, "CRMPRO","Title is not matching");		
	}
	
	@Test(priority=3)
	public void contactsLinksTest() {
		testutil.switchToFrame();
		contactsPage=homePage.clikonContactLink();
	}
	
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
