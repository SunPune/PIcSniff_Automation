package com.picsniff.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class galleryPage {
	//Create object of webdriver
	WebDriver ldriver;
	
	//Constructor
	public  galleryPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
 //Identify WebElements
	@FindBy(xpath = "//button[normalize-space()='View all']") WebElement viewAll;
	@FindBy(xpath = "//button[normalize-space()='View mine']") WebElement viewMine;
	@FindBy(css = ".ml-2") WebElement faceSearch;
	@FindBy(xpath = "//span[normalize-space()='Favourites']") WebElement favorites;
	@FindBy(xpath = "//button[@title='Guest Upload']") WebElement guestUploads;
	@FindBy(xpath = "//a[@title='Cart']") WebElement cart;
@FindBy(xpath = "//button[@title='Share the event']") WebElement shareEvent;
	@FindBy(xpath = "//input[@id='Enter your email']") WebElement galleryLoginInEmail;
	@FindBy(xpath = "//button[normalize-space()='Submit']") WebElement galleryLoginSubmit;
	@FindBy(xpath = "//button[contains(@title,'Logout')]//*[name()='svg']") WebElement galleryLogout;
	@FindBy(xpath = "//button[@title='Download Images']") WebElement downLoads;
	@FindBy(xpath = "//label[@for='radio-1']") WebElement highResolutiondownLoads;
	@FindBy(xpath = "(//input[@id='radio-2'])[1]") WebElement websizedownLoads;
	@FindBy(xpath  = "//button[normalize-space()='Download']") WebElement downloadButton;


	@FindBy(id = "fname") WebElement firstName;
	@FindBy(id = "lname") WebElement lastName;
	@FindBy(id = "email") WebElement emailId;
	@FindBy(css = ".mt-2 > .rounded-lg") WebElement findMyImage;
	@FindBy(css = ".text-sm > .hidden") WebElement uploadPhoto;

	
	//Identify action on webelement
	public void clickOnViewAll() {
		viewAll.click();
	}
	public void clickOnViewMine() {
		viewMine.click();
	}
	public void clickOnLogOut() {
		galleryLogout.click();
	}
	public void clickOnFaceSeach() {
		faceSearch.click();
	}
	public void clickOnFavorites() {
		favorites.click();
	}
	public void clickOnGuestUploads() {
		guestUploads.click();
	}
	public void clickOnCartIcon() {
		cart.click();
	}
	public void clickOnShareEventIcon() {
		shareEvent.click();
	}
	public void clickOnDownloads() {
		downLoads.click();
	}
	public void clickOnWebsizeDownloads() {
		websizedownLoads.click();
	}
	public void clickOnHighResolutionDownloads() {
		highResolutiondownLoads.click();
	}
	public void clickOnDownloadButton() {
		downloadButton.click();
	}
	public void enterFirstName(String fName) {
		firstName.sendKeys(fName);
	}
	public void enterLastName(String lName) {
		lastName.sendKeys(lName);
	}
	public void enteremailAddress(String emailAddress) {
emailId.sendKeys(emailAddress);
	}
	public void enterGalleryEmail(String galleryEmail) {
		galleryLoginInEmail.sendKeys(galleryEmail);
	}
	public void clickOnGalleryLoginSubmit() {
		galleryLoginSubmit.click();
	}

	public void uploadPhoto(String upLoadPhoto) {
		uploadPhoto.sendKeys(upLoadPhoto);
			}
	public void uploadPhoto1(String upLoadPhoto1) {
		uploadPhoto.sendKeys(upLoadPhoto1);
			}
	public void clickOnFindMyImage() {
		findMyImage.click();
	}
}
