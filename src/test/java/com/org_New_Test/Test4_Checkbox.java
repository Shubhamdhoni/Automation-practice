package com.org_New_Test;

import org.testng.annotations.Test;

import com.org_New_beforeComponents.BaseTestNew;
import com.org_New_pageModules.CheckboxExample;

public class Test4_Checkbox extends BaseTestNew {
	CheckboxExample ch;
	
	@Test
	public void test() {
		ch= new CheckboxExample(driver);
		
	System.out.println(ch.GetText(ch.CheckboxExample));
	ch.clicks(ch.CheckboxOption1);
	ch.clicks(ch.CheckboxOption2);
	ch.clicks(ch.CheckboxOption3);
		
	}

}
