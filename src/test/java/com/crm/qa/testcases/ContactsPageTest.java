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

public class ContactsPageTest extends TestBase{
	LogInPage loginPage;
	HomePage homePage;
	TestUtil testutil;
	ContactsPage contactsPage;
	
	public ContactsPageTest() {
		super();
	}
	@BeforeMethod
	public void setUp() {
		initialization();
		testutil= new TestUtil();
		loginPage=new LogInPage();
		contactsPage=new ContactsPage();
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		testutil.switchToFrame();
		contactsPage= homePage.clikonContactLink();
	}	 
	
	@Test
	public void verifyContactsPageLabel() {
		Assert.assertTrue(contactsPage.verifyContactsLebel(),"");
	}
	@Test
	public void selectContactsTest() {
		contactsPage.selectContactsByName("");
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
