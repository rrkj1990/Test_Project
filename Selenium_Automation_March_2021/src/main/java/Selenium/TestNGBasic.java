package Selenium;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasic {
	
	//Setup for google chrome
	//Login into the App
	//Launch the Chrome Browser
	//Entre the URL
	//Get The Tab page Title 
	//Logout from the App
	//close all the Broser
	//Delete the cokies
	
	
	@BeforeSuite
	public void setup() {
		
		System.out.println("Setup for google chrome");
	}
	
	@BeforeTest
	public void login() {
		System.out.println("Login into the App");
	}
	
	
	@BeforeClass
	public void LaunchBrowser() {
		
		System.out.println("Launch the Chrome Browser");
	}
	
	
	@BeforeMethod
	public void EntreURL() {
		System.out.println("Entre the URL");
	}
	
	@Test
	public void googletitle() {
		
		System.out.println("Get The Tab page Title ");
	}
	
	@Test
	public void search() {
		System.out.println("Search text");
	}
	
	@AfterMethod
	public void Loogout() {
		System.out.println("Logout from the App");
	}
	
	@AfterClass
	public void closebrowser() {
		System.out.println("close all the Broser");
	}
	
	@AfterTest
	public void DeleteallCokie() {
		System.out.println("Delete the cokies");
	}
	
	
	
	@AfterSuite
	public void testreport() {
		
		System.out.println("Generate the Test Report");
	}
	

}
