package com.org_New_pageModules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.org_New_beforeComponents.BrowserActionNew;

public class iFrameExample extends BrowserActionNew {
	
	public WebDriver driver;

	public iFrameExample(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//legend[text()='iFrame Example']")
	public WebElement iFrameText;
	
	@FindBy(xpath="//*[@name='iframe-name']")
	public WebElement iFrameSwitch;
	
	@FindBy(xpath="(//a[text()='Home'])[1]")
	public WebElement iFrame;


}
