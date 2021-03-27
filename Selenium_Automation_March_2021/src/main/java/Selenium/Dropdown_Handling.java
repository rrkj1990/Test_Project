package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Dropdown_Handling {

	public static void main(String[] args) throws InterruptedException  {
		
		String DriverPath ="I:\\\\Manish_Java_Classes\\\\chromedriver_win32\\\\Chrome_89\\\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", DriverPath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		driver.manage().window().maximize();
		WebElement web = driver.findElement(By.id("select-demo"));
		
		Select sel = new Select(web);
		sel.selectByValue("Monday");
		Thread.sleep(2000);
		sel.selectByIndex(5);
		Thread.sleep(2000);
		sel.selectByVisibleText("Friday");
		
		
		 List<WebElement> options = sel.getOptions();
		 System.out.println("The Size is "+ options.size());
		System.out.println( options.get(6).getText());
		
		for(int i = 0; i<options.size(); i++) {
			
			System.out.println(options.get(i).getText());
		}
		 
		 
		
		Thread.sleep(2000);
		driver.quit();
		
	}

}
