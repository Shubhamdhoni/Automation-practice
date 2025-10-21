package com.org_New_Test;

import org.testng.annotations.Test;

import com.org_New_beforeComponents.BaseTestNew;
import com.org_New_pageModules.iFrameExample;

public class Test10_iFrame extends BaseTestNew{
	
	iFrameExample ii;
	
	@Test
	public void test() {
		
		ii = new iFrameExample(driver);
		
		System.out.println(ii.GetText(ii.iFrameText));
		driver.switchTo().frame(ii.iFrameSwitch);
		System.out.println(ii.GetText(ii.iFrame));
		
        // Switch back to the default content
//        driver.switchTo().defaultContent();

		
		
	}

}
