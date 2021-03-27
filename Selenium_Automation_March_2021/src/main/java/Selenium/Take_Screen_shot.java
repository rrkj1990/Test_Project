package Selenium;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Take_Screen_shot {

	
	
	public static void main(String[] args) {
		
		String DriverPath = "I:\\\\\\\\Manish_Java_Classes\\\\\\\\chromedriver_win32\\\\\\\\Chrome_89\\\\\\\\chromedriver.exe";
	    System.setProperty("webdriver.chrome.driver", DriverPath);
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
	    TakesScreenshot ts = (TakesScreenshot)driver;
	    File source = ts.getScreenshotAs(OutputType.FILE);
	    
	    // Need to copy the file into the location
	    
	    FileUtils.copyFile(source, new File("./Screenshots/Screen.png"));
	    System.out.println("the Screenshot is taken");
	    driver.quit();
	    
	}
}