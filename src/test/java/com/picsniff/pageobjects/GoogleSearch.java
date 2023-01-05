package com.picsniff.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearch {
	//Create object of webdriver
		WebDriver ldriver;
		
		//Constructor
		public  GoogleSearch(WebDriver rdriver) {
			ldriver = rdriver;
			PageFactory.initElements(rdriver, this);
		}
	 //Identify WebElements
		@FindBy(name = "q") WebElement seachText;
		@FindBy(name = "btnK") WebElement googleSearch;
		
		
		//Identify action on webelement
		
		public void enterSearchKeyword(String text) {
			seachText.sendKeys(text);
				}
		public void clickOnGoogleSearchButton() {
			googleSearch.click();
		}
	}
