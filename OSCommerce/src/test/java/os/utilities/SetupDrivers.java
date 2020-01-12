package os.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SetupDrivers {
	
	public static WebDriver driver;
	
	public static void setupDrivers(){
		WebDriverManager.chromedriver().version("79.0.3945.36").setup();
		driver = new ChromeDriver();
	}
	public static WebDriver getDriver(){
		return driver;
	}
	public static void tearDownDriver(){
		driver.quit();
	}

}
