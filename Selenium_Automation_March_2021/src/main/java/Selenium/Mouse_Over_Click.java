package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Mouse_Over_Click {

	public static void main(String[] args) throws InterruptedException {
		
		
		String DriverPath ="I:\\\\Manish_Java_Classes\\\\chromedriver_win32\\\\Chrome_89\\\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", DriverPath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		WebElement ele1 = driver.findElement(By.xpath("//*[@data-group='women']"));
		act.moveToElement(ele1).build().perform();
		Thread.sleep(3000);
		/*
		 * WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		 * wait.untill(ExpectedConditions.invisibilityOf(element))
		 */
		WebElement ele2 = driver.findElement(By.xpath("//*[@data-reactid=\"198\"]"));
		act.moveToElement(ele2).build().perform();
		Thread.sleep(3000);
		String url =driver.getCurrentUrl();
		System.out.println(url);
		driver.quit();
		
	}

}
