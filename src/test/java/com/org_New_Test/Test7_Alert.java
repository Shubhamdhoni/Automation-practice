package com.org_New_Test;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import com.org_New_beforeComponents.BaseTestNew;
import com.org_New_pageModules.AlertExample;
import com.org_New_utility.ExcelReader;

public class Test7_Alert extends BaseTestNew{
	
	AlertExample al;
	ExcelReader ex;
	Alert alt;
	
	@Test
	public void test() throws InterruptedException {
		
		al = new AlertExample(driver);
		ex = new ExcelReader();
	//	alt = driver.switchTo().alert();
		
		String name = ex.getTestData("Test7_Alert", "Enter Your Name");
		
		System.out.println(al.GetText(al.SwitchToAlertExample));
		
		al.sendKeys(al.EnterName, name);
		al.clicks(al.alert);
		alt = driver.switchTo().alert();
		alt.accept();
		
		Thread.sleep(2000);
		
		al.sendKeys(al.EnterName, name);
		al.clicks(al.confirm);
		alt = driver.switchTo().alert();
		alt.dismiss();
		
	}

}
