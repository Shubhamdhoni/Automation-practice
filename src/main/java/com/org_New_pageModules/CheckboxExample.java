package com.org_New_pageModules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.org_New_beforeComponents.BrowserActionNew;

public class CheckboxExample extends BrowserActionNew {
	
	public WebDriver driver;

	public CheckboxExample(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//legend[text()='Checkbox Example']")
	public WebElement CheckboxExample;
	@FindBy(xpath="//input[@value='option1']")
	public WebElement CheckboxOption1;
	@FindBy(xpath="//input[@value='option2']")
	public WebElement CheckboxOption2;
	@FindBy(xpath="//input[@value='option3']")
	public WebElement CheckboxOption3;
	


}
