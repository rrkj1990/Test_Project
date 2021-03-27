package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Printing_All_Links_From_WebPage {

	public static void main(String[] args) throws InterruptedException {  
		
		String DriverPath ="I:\\\\Manish_Java_Classes\\\\chromedriver_win32\\\\Chrome_89\\\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", DriverPath);
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.wikipedia.org/");
			driver.manage().window().maximize();
			WebElement dropdown = driver.findElement(By.id("searchLanguage"));
			
			Select sel = new Select(dropdown);
			sel.selectByValue("hi");
			Thread.sleep(2000);
			//sel.selectByIndex(5);
			//Thread.sleep(2000);
			//sel.selectByVisibleText("Friday");
			
			List<WebElement> values = driver.findElements(By.tagName("option"));
			 System.out.println("The Size is "+ values.size());
			System.out.println( values.get(6).getText());
			
			for(int i = 0; i<values.size(); i++) {
				
				System.out.println(values.get(i).getText());
			}
			System.out.println("------------Priting Links-----------");
			List<WebElement> links = driver.findElements(By.tagName("a"));
			System.out.println("The Links Size is "+ links.size());
			
			for(int j = 0;j<links.size();j++) {
				System.out.println(links.get(j).getAttribute("href"));
				
			}
			driver.quit();
	}

}
