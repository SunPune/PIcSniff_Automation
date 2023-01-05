import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserTest {

	
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		HashMap<String, Integer> contentSettings = new HashMap<String, Integer>();
		HashMap<String, Object> profile = new HashMap<String, Object>();
		HashMap<String, Object> prefs = new HashMap<String, Object>();
		contentSettings.put("media_stream", 1);
		profile.put("managed_default_content_settings", contentSettings);
		prefs.put("profile", profile);
		options.setExperimentalOption("prefs", prefs);
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://garment.algomage.com/view/new-1/day-1");
	    System.out.println("page opened");
        Thread.sleep(5000);
	    driver.findElement(By.cssSelector(".w-\\[92px\\]:nth-child(3)")).click();
	    System.out.println("clicked view all");
        Thread.sleep(5000);
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
	    driver.findElement(By.cssSelector(".ml-2")).click();
	    System.out.println("clicked face search button");
        Thread.sleep(5000);
	    driver.findElement(By.xpath("//input[@id=\'fname\']")).sendKeys("p1");
        Thread.sleep(1000);
	    driver.findElement(By.id("lname")).sendKeys("k1");
	    Thread.sleep(1000);
	    driver.findElement(By.id("email")).sendKeys("sunpune2@gmail.com");
	    System.out.println("Entered email id");
	    Thread.sleep(1000);
	    driver.findElement(By.cssSelector(".mt-2 > .rounded-lg")).click();
	    System.out.println("clicked Find my image button");
	    Thread.sleep(5000);
	    	   // Actions action = new Actions(driver);
	    //action.sendKeys(Keys.ESCAPE).build().perform();
	      //((WebElement) driver).sendKeys(Keys.RETURN);
		   // Thread.sleep(10000);
	   // driver.switchTo().alert().dismiss();
	    driver.findElement(By.cssSelector(".text-cyan")).click();
	    System.out.println("clicked browse photo button");
        Thread.sleep(1000);
	    driver.findElement(By.cssSelector(".text-sm > .hidden")).sendKeys("C:\\Users\\Sunil\\Downloads\\Sunil photo.jpg");
        Thread.sleep(5000);
	}

	
	}

