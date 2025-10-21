package com.org_New_pageModules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.org_New_beforeComponents.BrowserActionNew;

public class AlertExample extends BrowserActionNew{
	
	public WebDriver driver;

	public AlertExample(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath="//legend[text()='Switch To Alert Example']")
	public WebElement SwitchToAlertExample;
	
	@FindBy(xpath="//input[@id='name']")
	public WebElement EnterName;
	
	@FindBy(xpath="//input[@value='Alert']")
	public WebElement alert;
	
	@FindBy(xpath="//input[@value='Confirm']")
	public WebElement confirm;

}
