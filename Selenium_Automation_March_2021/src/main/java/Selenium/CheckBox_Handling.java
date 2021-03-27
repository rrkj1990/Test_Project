package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox_Handling {

	public static void main(String[] args) throws InterruptedException {
		
		String DriverPath ="I:\\\\Manish_Java_Classes\\\\chromedriver_win32\\\\Chrome_89\\\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", DriverPath);
			WebDriver driver = new ChromeDriver();
			driver.get("http://www.tizag.com/htmlT/htmlcheckboxes.php");
			driver.manage().window().maximize();
			
			//driver.findElement(By.xpath("//*[@value='basketball']")).click();
			
			for(int i =1; i<=4; i++) {
			driver.findElement(By.xpath("//div[4]/input["+i+"]")).click();
			}
			Thread.sleep(2000);
			driver.quit();
		
		
		
		
	}

}
