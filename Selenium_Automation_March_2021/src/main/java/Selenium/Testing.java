package Selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing {

	public static void main(String[] args) throws InterruptedException {
		
		String DriverPath = "I:\\\\\\\\\\\\\\\\Manish_Java_Classes\\\\\\\\\\\\\\\\chromedriver_win32\\\\\\\\\\\\\\\\Chrome_89\\\\\\\\\\\\\\\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", DriverPath);
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.seleniumeasy.com/test/window-popup-modal-demo.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id='followall']")).click();
		
		Set <String> handle1 = driver.getWindowHandles();
		Iterator <String> itr = handle1.iterator();
		String ParentID1 = itr.next();
		System.out.println("Parent ID1 id "+ ParentID1);
		String ChildID1 = itr.next();
		System.out.println("Child ID id "+ ChildID1);
		String ChildTitle1 = driver.getTitle();
		System.out.println("Child Title is "+ ChildTitle1);
		String ChildID2 = itr.next();
		System.out.println("Child ID id "+ ChildID1);
		String ChildTitle2 = driver.getTitle();
		System.out.println("Child Title is "+ ChildTitle2);
		
		
		
		Thread.sleep(2000);
		driver.quit();
		
	}

}
