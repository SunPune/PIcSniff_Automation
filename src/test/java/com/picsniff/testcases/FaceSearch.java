package com.picsniff.testcases;
import java.time.Duration;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceSearch {
	private WebDriver driver;
	private ChromeOptions coptions = new ChromeOptions();
	private EdgeOptions eoptions = new EdgeOptions();
	


	@Parameters("browserName")
	@BeforeTest(alwaysRun=true)
	public  void setUpTest(String browserName) {
		

		if(browserName.equalsIgnoreCase("chrome")) {
			System.out.println("Browser name is: "+browserName);
			//ChromeOptions coptions = new ChromeOptions();
			HashMap<String, Integer> contentSettings = new HashMap<String, Integer>();
			HashMap<String, Object> profile = new HashMap<String, Object>();
			HashMap<String, Object> prefs = new HashMap<String, Object>();
			contentSettings.put("media_stream", 2);
			profile.put("managed_default_content_settings", contentSettings);
			prefs.put("profile", profile);
			coptions.setExperimentalOption("prefs", prefs);
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(coptions);
		}
		else if(browserName.equalsIgnoreCase("edge")) {
			System.out.println("Browser name is : "+browserName);
			//EdgeOptions eoptions = new EdgeOptions();
			HashMap<String, Integer> contentSettings = new HashMap<String, Integer>();
			HashMap<String, Object> profile = new HashMap<String, Object>();
			HashMap<String, Object> prefs = new HashMap<String, Object>();
			contentSettings.put("media_stream", 2);
			profile.put("managed_default_content_settings", contentSettings);
			prefs.put("profile", profile);
			eoptions.setExperimentalOption("prefs", prefs);
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver(eoptions);
		}
	/*	HashMap<String, Integer> contentSettings = new HashMap<String, Integer>();
		HashMap<String, Object> profile = new HashMap<String, Object>();
		HashMap<String, Object> prefs = new HashMap<String, Object>();
		contentSettings.put("media_stream", 2);
		profile.put("managed_default_content_settings", contentSettings);
		prefs.put("profile", profile);
		options.setExperimentalOption("prefs", prefs);
		*/
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		System.out.println("In setUpTest");
	}

	@Test
	public void loginTest() throws InterruptedException {
		driver.get("https://garment.algomage.com/view/new-1/day-1");
	    System.out.println("page opened in : ");
        Thread.sleep(5000);
	    driver.findElement(By.cssSelector(".w-\\[92px\\]:nth-child(3)")).click();
	    System.out.println("clicked view all");
	    Thread.sleep(1000);
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
	    driver.findElement(By.cssSelector(".ml-2")).click();
	    System.out.println("clicked face search button");
        Thread.sleep(1000);
	    driver.findElement(By.xpath("//input[@id=\'fname\']")).sendKeys("h1");
        Thread.sleep(1000);
	    driver.findElement(By.id("lname")).sendKeys("p1");
	    Thread.sleep(1000);
	    driver.findElement(By.id("email")).sendKeys("sunpuneh1p1@gmail.com");
	    System.out.println("Entered email id");
	    Thread.sleep(1000);
	    driver.findElement(By.cssSelector(".mt-2 > .rounded-lg")).click();
	    System.out.println("clicked Find my image button");
	    Thread.sleep(5000);
	    //driver.findElement(By.cssSelector(".text-cyan")).click();
	   // System.out.println("clicked browse photo button");
        //Thread.sleep(1000);
	    driver.findElement(By.cssSelector(".text-sm > .hidden")).sendKeys("C:\\Users\\Sunil\\Downloads\\Sunil photo.jpg");
        Thread.sleep(5000);
	}

	@AfterTest
	public void tearDownTest() {
		driver.close();
		driver.quit();
		System.out.println("completed successfully");
	}
}
