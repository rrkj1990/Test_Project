package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BasicSelenium {
	
	WebDriver driver;
	
	@BeforeMethod
	public void Setup() throws InterruptedException {
		
		String DriverPath = "I:\\Manish_Java_Classes\\chromedriver_win32\\Chrome_89\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", DriverPath);
		 driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
	}
	@Test
	public void gettitle() {
		String title= driver.getTitle();
		System.out.println("The Page Title is => " + title);
	}
	
	@Test
	public void loginpage() {
		System.out.println("Login the homepage");
	}
	
	@Test
	public void image() {
		driver.get("https://online.actitime.com/abc3/login.do");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@type='text']")).sendKeys("Rituraj");
	}
	
	
	@AfterMethod
	public void close() {
		driver.quit();
	}

	
	
	
	
}
