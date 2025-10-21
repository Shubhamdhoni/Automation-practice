package com.org_New_Test;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.org_New_beforeComponents.BaseTestNew;
import com.org_New_pageModules.MouseHoverExample;

public class Test9_MouseHover extends BaseTestNew{
	
	MouseHoverExample mt;
	Actions act;
	
	@Test
	public void test() {
		mt = new MouseHoverExample(driver);
		act = new Actions(driver);
		
		act.scrollToElement(mt.MouseHoverText);
		System.out.println(mt.GetText(mt.MouseHoverText));
//		act.scrollToElement(mt.mouse);
		act.moveToElement(mt.mouse).build().perform();
		mt.clicks(mt.Top);
		
		
	}

}
