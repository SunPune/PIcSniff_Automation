package com.picsniff.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PhotogrpaherDashboard {
	//Create object of webdriver
	WebDriver ldriver;
	//Constructor
	public  PhotogrpaherDashboard(WebDriver rdriver) {
ldriver = rdriver;
PageFactory.initElements(rdriver, this);
}
	//Identify weblements
	@FindBy(xpath = "(//span[@class='text-white text-center'])[1]") WebElement profileIcon;
	@FindBy(xpath ="//*[@id=\"headlessui-listbox-option-7\"]") WebElement userEmail;
	@FindBy(xpath = "/html/body/div[7]/div/div[1]/a") WebElement helpTourCloseButton;
	@FindBy(xpath = "//*[@id=\"headlessui-listbox-option-9\"]/div/span") WebElement logoutButton;
	
	
	
	
	//Identify Webelements actions
	public void clickOnProfileIcon() {
		profileIcon.click();
	}
	public String getUserEmail() {
		return(userEmail.getText());
	}
	public void clickOnHelptourButton() {
		helpTourCloseButton.click();
	}
	public void clickOnLogoutButton() {
		logoutButton.click();
	}
}
