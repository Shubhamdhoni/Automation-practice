package com.org_New_Test;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.org_New_beforeComponents.BaseTestNew;
import com.org_New_pageModules.SuggessionClassExample;
import com.org_New_utility.ExcelReader;

public class Test2_SuggessionClass extends BaseTestNew {
	
	SuggessionClassExample ss;
	ExcelReader ex;
	Actions act;
	
	@Test
	public void test () {
		
		ss = new SuggessionClassExample(driver);
		ex = new ExcelReader();
		act = new Actions(driver);
		
		String text = ex.getTestData("Test2_SuggessionClass", "Text");
		System.out.println(ss.GetText(ss.SuggessionClassExample));
		ss.sendKeys(ss.suggession, text);
		act.moveToElement(ss.india);
		ss.clicks(ss.india);



}
}