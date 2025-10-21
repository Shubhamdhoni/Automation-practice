package com.org_New_pageModules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.org_New_beforeComponents.BrowserActionNew;

public class SwitchWindowExample extends BrowserActionNew {
	
	public WebDriver driver;

	public SwitchWindowExample(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//legend[text()='Switch Window Example']")
	public WebElement SwitchWindowExample;
	
	@FindBy(xpath="//button[@id='openwindow']")
	public WebElement openWindow;
	
	@FindBy(xpath="//span[contains(text(),'Siri Balaji')]")
	public WebElement address;


}
