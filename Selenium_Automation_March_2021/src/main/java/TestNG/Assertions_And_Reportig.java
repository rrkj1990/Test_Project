package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions_And_Reportig {

	@Test
	public void validateTitles() {
		
		String expected_title = "yahoo.com";
		String actual_title = "Google.com";
		
		Assert.assertEquals(actual_title, expected_title);
		
	}
	
	

	}


