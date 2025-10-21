package com.org_New_pageModules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.org_New_beforeComponents.BrowserActionNew;

public class MouseHoverExample extends BrowserActionNew{
	
	public WebDriver driver;

	public MouseHoverExample(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//legend[text()='Mouse Hover Example']")
	public WebElement MouseHoverText;
	
	@FindBy(xpath="//button[@id='mousehover']")
	public WebElement mouse;
	
	@FindBy(xpath="//a[text()='Top']")
	public WebElement Top;


}
