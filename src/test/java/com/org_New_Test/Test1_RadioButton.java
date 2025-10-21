package com.org_New_Test;

import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.org_New_beforeComponents.BaseTestNew;
import com.org_New_pageModules.RadioButtonExample;
import com.org_New_utility.ExcelReader;

public class Test1_RadioButton extends BaseTestNew {

	RadioButtonExample hh;
	ExcelReader ex;
	Actions act;

	@Test
	public void test() {

		hh = new RadioButtonExample(driver);
		ex = new ExcelReader();
		act = new Actions(driver);

		test.log(Status.PASS, "Radioo button Heading");
		Reporter.log("Radio button");
		System.out.println(hh.GetText(hh.RadioButtonExample));
		test.log(Status.PASS, "It Will Click On 2 Option");
		hh.clicks(hh.Radio2);
		test.log(Status.PASS, "Radio2 print");
		System.out.println(hh.GetText(hh.Radio2));

	}

}
