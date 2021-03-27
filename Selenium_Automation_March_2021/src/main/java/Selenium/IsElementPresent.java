package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsElementPresent {
	
	public static WebDriver driver;
	
	public static boolean ElementPresent(String locator) {
		try {
		driver.findElement(By.xpath(locator));
		return true;
		} catch(Throwable T){
			return false;
		}
		
	}

	public static void main(String[] args) throws InterruptedException {  
			
			String DriverPath ="I:\\\\Manish_Java_Classes\\\\chromedriver_win32\\\\Chrome_89\\\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", DriverPath);
				 driver = new ChromeDriver();
				driver.get("https://www.wikipedia.org/");
				driver.manage().window().maximize();
				
				System.out.println(ElementPresent("//*[@id ='searchLanguage']"));
				driver.quit();
				
				
				
				
		
		
		
		
	}

}
