package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

	
	public static WebDriver driver;
	
	public void initDriver() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Shahed's PC\\\\Downloads\\\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://techfios.com/billing/?ng=login/");
		
		
	}
	
	
	
	
	
}
