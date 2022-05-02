package com.simplilearn.webapptest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleHomePageLauchTest {

	public static void main(String[] args) {
		
		// 1. formulate a test url
		String siteUrl = "https://www.google.com/";
		String driverPath = "drivers/linux/chromedriver";
		
		// 2. set selenium system properties
		System.setProperty("webdriver.chrome.driver", driverPath);
		
		// 3. instantiate selenium web driver
		WebDriver driver = new ChromeDriver();
		
		// 4. launch browser
		driver.get(siteUrl);
		
		// 5. perform test
		String expectedTitle = "Google";
		String actualTitle = driver.getTitle();
		
		System.out.println("Expected Title : "+expectedTitle);
		System.out.println("Actual Title : "+actualTitle);
		
		if(expectedTitle.equals(actualTitle)) {
			System.out.println("Test is passed !");
		} else {
			System.out.println("Test is failed !");
		}
		
		// 6. close driver
		driver.close();
	}

}
