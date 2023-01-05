package com.picsniff.testcases;

import org.testng.annotations.Test;

import com.picsniff.pageobjects.GoogleSearch;
import com.picsniff.pageobjects.galleryPage;

public class TC_GoogleSearch extends BaseClass {

	@Test
	public void verifyGoogleSearch() {
		driver.get(gurl);
	
		GoogleSearch pg = new GoogleSearch(driver);
		pg.enterSearchKeyword("Sachin Tendulkar");
		System.out.println("Entered Sachin Tendulkar as search keyword");

		pg.clickOnGoogleSearchButton();
		System.out.println("Clicked on Google search button");

	}
}
