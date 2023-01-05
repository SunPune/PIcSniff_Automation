package com.picsniff.testcases;

import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import com.picsniff.uitilities.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	ReadConfig readConfig = new ReadConfig();
	
	String url = readConfig.getGalleryLink();
	String url1 = readConfig.getGalleryLink1();
	String commontestemail = readConfig.getCommonEmail();
	String photo = readConfig.getPhoto1();
	String photo1 = readConfig.getPhoto1();
	String browser = readConfig.getBrowser();
	String gurl = readConfig.getGooglePageLink();
	String algomageloginlink = readConfig.getAlgomageLoginLink();
	String algomageuseremail = readConfig.getAlgomageEmailAddress();
	String algomageuserpassword = readConfig.getAlgomageUserPassword();



	public  WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		
			//WebDriverManager.chromedriver().setup();
			//driver = new ChromeDriver();
		EdgeOptions eoptions = new EdgeOptions();
		HashMap<String, Integer> contentSettings = new HashMap<String, Integer>();
		HashMap<String, Object> profile = new HashMap<String, Object>();
		HashMap<String, Object> prefs = new HashMap<String, Object>();
		contentSettings.put("media_stream", 2);
		profile.put("managed_default_content_settings", contentSettings);
		prefs.put("profile", profile);
		eoptions.setExperimentalOption("prefs", prefs);
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver(eoptions);
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
				

	//IMplicit wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
	}
	@AfterClass
	public void tearDown() {
		driver.close();
		driver.quit();
	}
}