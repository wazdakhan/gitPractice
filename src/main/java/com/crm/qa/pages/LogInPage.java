package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LogInPage extends TestBase {
	
	//Page Factory- OR
	
	@FindBy(name="username")
	WebElement usernam;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="")
	WebElement loginBtn;
	
	@FindBy(xpath="")
	WebElement signupBtn;
	
	@FindBy(xpath= "")
	WebElement logo;
	
	//Initializing the page object OR
	public LogInPage() {
		PageFactory.initElements(driver, this);
		
		
	}
	//Actions:
	public String validateloginPageTitle() {
		return driver.getTitle(); 
	}
	
	public boolean validateImage() {
		return logo.isDisplayed();
	}
	
	public HomePage login(String un,String pwd) {
		usernam.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();
		return new HomePage();
		
	}
	

}
