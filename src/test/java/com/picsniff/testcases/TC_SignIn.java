package com.picsniff.testcases;

import org.testng.annotations.Test;
import org.testng.Assert;

import com.picsniff.pageobjects.PhotogrpaherDashboard;
import com.picsniff.pageobjects.algomageLoginPage;

//import dev.failsafe.internal.util.Assert;

public class TC_SignIn extends BaseClass{

	@Test
	public void verifySignIn() throws InterruptedException {
		driver.get(algomageloginlink);
		Thread.sleep(1000);
		algomageLoginPage pg= new algomageLoginPage(driver);
		pg.enterEmailId(algomageuseremail);
		Thread.sleep(1000);
		pg.enterPassword(algomageuserpassword);
		Thread.sleep(1000);
		pg.clickOnSignInButton();
		Thread.sleep(1000);
		PhotogrpaherDashboard pg1 = new PhotogrpaherDashboard(driver);
		Thread.sleep(1000);
		pg1.clickOnHelptourButton();
		System.out.println("Closed help tour ");
		Thread.sleep(1000);
		pg1.clickOnProfileIcon();
		System.out.println("Clicked on profile icon");
		Thread.sleep(1000);	
		String useremail = pg1.getUserEmail();
		System.out.println("User Email id is : " +useremail );
		Thread.sleep(1000);	
		Assert.assertEquals(algomageuseremail, useremail);
		//Assert.assertEquals(algomageuseremail,useremail);
	/*	if (useremail.equalsIgnoreCase(algomageuseremail)) {
			System.out.println("TC PASSED");
			
		} else {
			System.out.println("TC FAILED");
	
		}*/
		}
}
