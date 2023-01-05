package com.picsniff.testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.*;

import java.io.IOException;

import org.testng.Assert;

import com.picsniff.pageobjects.PhotogrpaherDashboard;
import com.picsniff.pageobjects.algomageLoginPage;
import com.picsniff.uitilities.ReadExcelFile;

//import dev.failsafe.internal.util.Assert;

public class TC_SignInDataDriven extends BaseClass{

	@Test(dataProvider = "LoginDataProvider")
	public void verifySignIn(String userEmail, String userPassword, String expectedUserEmail) throws IOException, InterruptedException  {
		driver.get(algomageloginlink);
		System.out.println("Login page opened successfully");
		Thread.sleep(10000);
		algomageLoginPage pg= new algomageLoginPage(driver);
		pg.enterEmailId(userEmail);
		Thread.sleep(1000);
		pg.enterPassword(userPassword);
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
		Assert.assertEquals(expectedUserEmail, useremail);
		pg1.clickOnLogoutButton();
		System.out.println("Logged Out Successfully:"  +useremail);
		Thread.sleep(1000);	
		driver.manage().deleteAllCookies();
		//Assert.assertEquals(algomageuseremail,useremail);
	/*	if (useremail.equalsIgnoreCase(algomageuseremail)) {
			System.out.println("TC PASSED");
			
		} else {
			System.out.println("TC FAILED");
	
		}*/
		}
		@DataProvider(name = "LoginDataProvider")
		public String[][] LoginDataProvider()
		{
			//System.out.println(System.getProperty("user.dir"));
			String fileName = System.getProperty("user.dir") + "/TestData/AlgomageLoginData.xlsx";
	
	
			int ttlRows = ReadExcelFile.getRowCount(fileName, "LoginTestData");
			int ttlColumns = ReadExcelFile.getColCount(fileName, "LoginTestData");
		
	
			String data[][]=new String[ttlRows-1][ttlColumns];
			System.out.println("Rows: " + ttlRows + " " + "Columns: " + ttlColumns);
	
			for(int i=1;i<ttlRows;i++)//rows =1,2
			{
				for(int j=0;j<ttlColumns;j++)//col=0, 1,2
				{					//System.out.println(data[i][j] + " ");
	
					data[i-1][j]=ReadExcelFile.getCellValue(fileName,"LoginTestData", i,j);
										
				}
			}
			//System.out.println(data);
			return data;
	}

}
