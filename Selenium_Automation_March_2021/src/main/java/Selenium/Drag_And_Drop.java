package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_And_Drop {

	public static void main(String[] args) throws InterruptedException {
		
		String DriverPath ="I:\\\\Manish_Java_Classes\\\\chromedriver_win32\\\\Chrome_89\\\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", DriverPath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.testandquiz.com/selenium/testing.html");
		// driver.get("https://www.seleniumeasy.com/test/drag-and-drop-demo.html");
		driver.manage().window().maximize();
		
		
		//System.out.println("1st Element executed");
		WebElement darg = driver.findElement(By.id("sourceImage"));
		System.out.println("2nd Element executed");
		WebElement drop = driver.findElement(By.id("targetDiv"));
		Actions act = new Actions(driver);
		act.dragAndDrop(darg, drop).build().perform();
		
		/*
		 * act.dragAndDrop(driver.findElement(By.xpath("(//*[@draggable='true'][4])")),
		 * driver.findElement(By.xpath("//*[@id ='mydropzone']"))).build().perform();
		 */
		Thread.sleep(3000);
	}

}
