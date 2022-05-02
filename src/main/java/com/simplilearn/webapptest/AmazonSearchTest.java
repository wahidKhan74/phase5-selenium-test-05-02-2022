package com.simplilearn.webapptest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSearchTest {

	public static void main(String[] args) {
		
		// 1. formulate a test url
		String siteUrl = "https://www.amazon.in/";
		String driverPath = "drivers/linux/chromedriver";
		
		// 2. set selenium system properties
		System.setProperty("webdriver.chrome.driver", driverPath);
		
		// 3. instantiate selenium web driver
		WebDriver driver = new ChromeDriver();
		
		// 4. launch browser
		driver.get(siteUrl);
		
		//search text
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("Iphone 12 max pro");
		searchBox.submit();
		
		// 5. perform test
		String expectedTitle = "Amazon.in : Iphone 12 max pro";
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
