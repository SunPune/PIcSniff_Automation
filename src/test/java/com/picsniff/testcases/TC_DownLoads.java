package com.picsniff.testcases;

import java.util.ArrayList;

import org.testng.annotations.*;

import com.picsniff.pageobjects.galleryPage;

public class TC_DownLoads extends BaseClass{

	@Test
	
	public void verifyDownloads() throws InterruptedException {
		
		driver.get(url);
		Thread.sleep(1000);
		
		galleryPage pg = new galleryPage(driver);
		pg.clickOnViewAll();
		Thread.sleep(1000);
		System.out.println("Clicked on view all button");
		pg.clickOnDownloads();
		Thread.sleep(1000);
		System.out.println("Clicked on downloads icon");

		pg.enterGalleryEmail(commontestemail);
		Thread.sleep(1000);

		pg.clickOnGalleryLoginSubmit();
		Thread.sleep(1000);
		System.out.println("Logged in to gallery successfully");
		
		pg.clickOnDownloads();
		Thread.sleep(1000);
		System.out.println("Clicked on downloads icon");
		
		/*pg.clickOnWebsizeDownloads();
		Thread.sleep(1000);
		System.out.println("Select High Resolution downloads");
		*/
		pg.clickOnHighResolutionDownloads();
		Thread.sleep(2000);

		pg.clickOnDownloadButton();
		Thread.sleep(10000);
		System.out.println("Clicked on Download button");
		
	      ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
	      driver.switchTo().window(newTb.get(1));		
			System.out.println("Switched to downloads tab");
			Thread.sleep(5000);
			  driver.switchTo().window(newTb.get(0));		
				System.out.println("Switched back to main tab");
				Thread.sleep(5000);


	}
}
