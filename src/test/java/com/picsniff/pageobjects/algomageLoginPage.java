package com.picsniff.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class algomageLoginPage {
	WebDriver ldriver;
	
	//Create constructor
	
	public algomageLoginPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	//Identify webelements.
	@FindBy(id = "email-id") WebElement emailId;
	@FindBy(id = "password") WebElement paasWord;
	@FindBy(xpath = "(//button[normalize-space()='Sign In'])[1]") WebElement SignIn;
	
	
	//Identify actions on webelements.
	public void enterEmailId(String emailAddress) {
		emailId.sendKeys(emailAddress);
	}
	public void enterPassword(String password) {
		paasWord.sendKeys(password);
	}
	public void clickOnSignInButton() {
		SignIn.click();
	}
}
