package com.org_New_Test;

import org.testng.annotations.Test;

import com.org_New_beforeComponents.BaseTestNew;
import com.org_New_pageModules.SwitchTabExample;

public class Test6_SwitchTab extends BaseTestNew{
	
	SwitchTabExample st;
	
	@Test
	public void test () {
		
		st = new SwitchTabExample(driver);
		
		System.out.println(st.GetText(st.SwitchTabExample));
		st.clicks(st.switchTab);
		st.switchWindow(st.driver);
		st.GetText(st.switchAddress);
		
	}

}
