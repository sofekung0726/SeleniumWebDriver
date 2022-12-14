import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

class EZtest {

	@Test
	void test() {
		WebDriver driver = null;
		String browser = "firefox";
		
		if( browser.equalsIgnoreCase("chrome") ) {
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		else if ( browser.equalsIgnoreCase("firefox") ) {
			System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		else if ( browser.equalsIgnoreCase("Edge") ) {
			System.setProperty("webdriver.edge.driver", "C:\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		
		
		driver.get("http://www.google.com");
		driver.findElement(By.xpath("//input[@name=\'q\']")).sendKeys("npru");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		driver.quit();
	}
	
}

