package Vtiger.Vtiger.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class Utilities {

	public WebDriver driver;
	
	public WebDriver LaunchBrower() {
		WebDriverManager.chromedriver().setup();
		return driver= new ChromeDriver();
		
				
	}
	public void hitURL() {
		driver.get("http://localhost:8888");
		
	}

}
