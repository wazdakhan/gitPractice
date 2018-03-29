package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {
	@FindBy(xpath="//td[contains(text(),'username')]")
	WebElement usernameLavel;
	
	@FindBy(xpath="")
	WebElement username;
	
	@FindBy(xpath="//[contains(text(),'contacts)]")
	WebElement contractsLink;
	
	@FindBy(xpath="//[contains(text(),'New Contact)]")
	WebElement newContactlink;
	
	@FindBy(xpath="//[contains(text(),'Deals)]")
	WebElement dealsLink;
	
	@FindBy(xpath="//[contains(text(),'Tasks)]")
	WebElement tasksLink;
	
	
	
	public HomePage(){
		PageFactory.initElements(driver, this);
	}	
	public boolean verifyCorrectUserName() {
		return usernameLavel.isDisplayed();
		
	}
	
	public String verifyHomePageTitle() {	
	return	driver.getTitle();	
	}
	public ContactsPage clikonContactLink() {	
			contractsLink.click();
			return new ContactsPage();
		}
	
	public DealsPage clickonDealsLink() {	
		dealsLink.click();
		return new DealsPage();
	}
	
	public TasksPage clickontasksLink() {	
		tasksLink.click();
		return new TasksPage();
	}
	public void clickOnNewContact() {
		Actions actions=new Actions(driver);
		actions.moveToElement(contractsLink).build().perform();
		newContactlink.click();
		
		
		
		
	}



}
