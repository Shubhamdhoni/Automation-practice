package com.org_New_Test;

import org.testng.annotations.Test;

import com.org_New_beforeComponents.BaseTestNew;
import com.org_New_pageModules.WebTableExample;

public class Test8_WebTable extends BaseTestNew{
	
	WebTableExample wb;
	

	@Test
	public void test() {
		
		wb = new WebTableExample(driver);
		
		System.out.println(wb.GetText(wb.webTableExample));
		
		wb.GetAllText();
		
		
	}
	
}
