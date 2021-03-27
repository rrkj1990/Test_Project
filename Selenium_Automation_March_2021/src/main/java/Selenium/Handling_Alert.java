package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Alert {

	public static void main(String[] args) throws InterruptedException {
		
		String DriverPath = "I:\\\\\\\\\\\\\\\\Manish_Java_Classes\\\\\\\\\\\\\\\\chromedriver_win32\\\\\\\\\\\\\\\\Chrome_89\\\\\\\\\\\\\\\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", DriverPath);
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@class='btn btn-default']")).click();
		Alert alt = driver.switchTo().alert();
		Thread.sleep(2000);
		alt.accept();
		driver.findElement(By.xpath("//*[@class='btn btn-default btn-lg']")).click();
		Alert alt1 = driver.switchTo().alert();
		Thread.sleep(2000);
		alt1.dismiss();
		driver.findElement(By.xpath("//*[@onclick='myPromptFunction()']")).click();
		Alert alt2 = driver.switchTo().alert();
		alt2.sendKeys("Rituraj kumar jha ");
		Thread.sleep(2000);
		alt2.accept();
		Thread.sleep(2000);
		driver.quit();
		
	}

}
