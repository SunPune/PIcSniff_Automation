package com.picsniff.testcases;

import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;

import com.picsniff.pageobjects.galleryPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_FaceSearch extends BaseClass {
	
	
	@Test
	public void verifyFaceSearch() throws InterruptedException {
		driver.get(url1);
        Thread.sleep(25000);

		galleryPage pg = new galleryPage(driver);
		pg.clickOnViewAll();
		System.out.println("Clicked on view all button");
        Thread.sleep(12000);
		pg.clickOnFaceSeach();
		System.out.println("Clicked on face search option");
        Thread.sleep(1000);
        pg.enterFirstName("z11z");
        Thread.sleep(1000);
        pg.enterLastName("y11y");
        Thread.sleep(1000);
        pg.enteremailAddress("xy12z@xyz.com");
        Thread.sleep(1000);
        pg.clickOnFindMyImage();
        Thread.sleep(1000);
		System.out.println("Clicked on find my image button");

        pg.uploadPhoto1(photo1);
        Thread.sleep(25000);

	}
}
