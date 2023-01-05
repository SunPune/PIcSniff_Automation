import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Notifications {

	public static void main(String[] args) throws InterruptedException {
ChromeOptions options = new ChromeOptions();
HashMap<String, Integer> contentSettings = new HashMap<String, Integer>();
HashMap<String, Object> profile = new HashMap<String, Object>();
HashMap<String, Object> prefs = new HashMap<String, Object>();
contentSettings.put("media_stream", 2);
profile.put("managed_default_content_settings", contentSettings);
prefs.put("profile", profile);
options.setExperimentalOption("prefs", prefs);
WebDriverManager.chromedriver().setup();
//options.addArguments("disable-media-stream");
WebDriver driver = new ChromeDriver(options);
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.get("https://webcamtests.com/");
Thread.sleep(10000);
driver.findElement(By.id("webcam-launcher")).click();
System.out.println("here1");
Thread.sleep(10000);
driver.close();
driver.quit();



}
}