package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase{
	//@FindBy(xpath="//td[contains(text(), 'User: batchautomation')]");
	
	@FindBy(xpath= "//td[contains(text(), 'User: Demo User ')]")
	@CacheLookup
	WebElement userNameLabel;
	
	@FindBy(xpath= "//a[contains(text(), 'Contacts')]")
	WebElement contactsLink;
	
	@FindBy(xpath= "//a[contains(text(), 'Deals')]")
	WebElement dealsLink;
	
	@FindBy(xpath= "//a[contains(text(), 'Tasks')]")
	WebElement TasksLink;
	
	@FindBy(xpath= "//a[contains(text(), 'New Contact')]")  //New Contact
	WebElement newContactLink;
	
	//Initializing the Page Objects:
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePageTitle() {
		return driver.getTitle();
	}
	
	
	public ContactsPage clickOnContactsLink() {
		contactsLink.click();
		return new ContactsPage();
	}
	
	
	public DealsPage clickOndealsLink() {
		contactsLink.click();
		return new DealsPage();
	}
	
	
	public TasksPage TasksLink() {
		contactsLink.click();
		return new TasksPage();
	}
	
	public boolean verifyCorrectUserName() {
		return userNameLabel.isDisplayed();
	}
	
	public void clickOnNewContactLink() {
		Actions action = new Actions(driver);
		action.moveToElement(contactsLink).build().perform();
		newContactLink.click();
		
	}

}
