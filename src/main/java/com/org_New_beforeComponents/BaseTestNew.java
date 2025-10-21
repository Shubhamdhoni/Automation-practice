package com.org_New_beforeComponents;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.org_New_utility.ExtentReportNG;

@Listeners(com.org_New_utility.CustomListner.class)

public class BaseTestNew {

	public WebDriver driver;
	public ExtentTest test;
	ExtentReports extent = ExtentReportNG.getReportObject();
	
	@BeforeMethod
	public void startDriver() {
		
		test = extent.createTest(this.getClass().getSimpleName());

		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
	}
	
	@AfterMethod
	public void closeDriver() {
		driver.quit();
	}
	
	@AfterSuite
	public void closeExtent() {
		
		extent.flush();
	}


}
