package com.org_New_Test;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.org_New_beforeComponents.BaseTestNew;
import com.org_New_pageModules.DropdownExample;

public class Test3_Dropdown extends BaseTestNew {
	
	DropdownExample dd;
	Actions act;
	Select dropdown;
	
	@Test
	public void test () {
		
		dd = new DropdownExample(driver);
		act = new Actions(driver);
		dropdown = new Select(dd.drop);
		
		System.out.println(dd.GetText(dd.DropdownExample2));
		dropdown.selectByIndex(2);

	}
}
