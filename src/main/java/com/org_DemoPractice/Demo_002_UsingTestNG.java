package com.org_DemoPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Demo_002_UsingTestNG {
	
	WebDriver driver ;
	
	@BeforeClass
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	@Test
	public void verifyPracticePageTitle() {
		WebElement a = driver.findElement(By.xpath("//h1[text()='Practice Page']"));
		String actual = a.getText();
		System.out.println("Found Heading Text :"+actual);
		Assert.assertEquals(actual, "Practice Page", "Heading text does not match expected value");
		
		}
	@AfterClass
	public void tearDown() {
		if(driver != null) {
			driver.quit();
		}
	}
	
	
	

}
