import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverBrowserTest {
	//WebDriver driver = null;
	public static WebDriver driver;
	@BeforeTest
	public  void setUpTest() {
		//WebDriverManager.firefoxdriver().setup();
		WebDriverManager.chromedriver().setup();
		//WebDriverManager.edgedriver().setup();
ChromeOptions options= new ChromeOptions();
//option.addArguments("use-fake-ui-for-media-stream");
options.addArguments("disable-notifications");
		//driver = new FirefoxDriver();
		driver = new ChromeDriver(options);
		//driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}

	@Test
	public void loginTest() throws InterruptedException {
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
	    driver.findElement(By.xpath("//input[@id=\'fname\']")).sendKeys("s1");
        Thread.sleep(1000);
	    driver.findElement(By.id("lname")).sendKeys("n1");
	    Thread.sleep(1000);
	    driver.findElement(By.id("email")).sendKeys("sunpune@gmail.com");
	    System.out.println("Entered email id");
	    Thread.sleep(1000);
	    driver.findElement(By.cssSelector(".mt-2 > .rounded-lg")).click();
	    System.out.println("clicked Find my image button");
	    Thread.sleep(5000);
	    ChromeOptions options= new ChromeOptions();
	    options.addArguments("disable-notifications");
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

	@AfterTest
	public void tearDownTest() {
		driver.close();
		driver.quit();
	}
}
