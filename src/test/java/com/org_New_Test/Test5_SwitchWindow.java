package com.org_New_Test;

import org.testng.annotations.Test;

import com.org_New_beforeComponents.BaseTestNew;
import com.org_New_pageModules.SwitchWindowExample;

public class Test5_SwitchWindow extends BaseTestNew {
	
	SwitchWindowExample sw;
	
	@Test
	public void test() {
		
		sw = new SwitchWindowExample(driver);
		
		System.out.println(sw.GetText(sw.SwitchWindowExample));
		sw.clicks(sw.openWindow);
		sw.switchWindow(sw.driver);
		System.out.println(sw.GetText(sw.address));
		
	}

}
