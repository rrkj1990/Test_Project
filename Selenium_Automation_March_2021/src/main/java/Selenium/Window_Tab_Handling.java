package Selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Tab_Handling {

	public static void main(String[] args) throws InterruptedException {
		
		String DriverPath = "I:\\\\\\\\\\\\\\\\Manish_Java_Classes\\\\\\\\\\\\\\\\chromedriver_win32\\\\\\\\\\\\\\\\Chrome_89\\\\\\\\\\\\\\\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", DriverPath);
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.seleniumeasy.com/test/window-popup-modal-demo.html");
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		System.out.println("The Title is "+title);
		driver.findElement(By.xpath("//*[@title=\"Follow @seleniumeasy on Twitter\"]")).click();
		Set <String> handle = driver.getWindowHandles();
		
		Iterator <String> it = handle.iterator();
		String ParentID = it.next();
		System.out.println("Parent ID id "+ ParentID);
		String ChildID = it.next();
		System.out.println("Child ID id "+ ChildID);
		String ChildTitle = driver.getTitle();
		System.out.println("Child Title is "+ ChildTitle);
		
		// Multiple Window & Alert need to check how to handle 
		
		/*
		 * driver.switchTo().alert();
		 * driver.findElement(By.xpath("//*[@name='session[username_or_email]']")).
		 * sendKeys("Rituraj"); Thread.sleep(3000);
		 */
		driver.quit();
		
	}

}
