package com.org_New_pageModules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.org_New_beforeComponents.BrowserActionNew;

public class SwitchTabExample extends BrowserActionNew {
	
	public WebDriver driver;

	public SwitchTabExample(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//legend[@class='switch-tab']")
	public WebElement SwitchTabExample;
	
	@FindBy(xpath="//a[@id='opentab']")
	public WebElement switchTab;
	
	@FindBy(xpath="//span[contains(text(),'Siri Balaji')]")
	public WebElement switchAddress;

}
