package com.org_New_pageModules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.org_New_beforeComponents.BrowserActionNew;

public class SuggessionClassExample extends BrowserActionNew {
	
	public WebDriver driver;

	public SuggessionClassExample(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//legend[text()='Suggession Class Example']")
	public WebElement SuggessionClassExample;
	@FindBy(xpath="(//input[@type='text'])[1]")
	public WebElement suggession;
	@FindBy(xpath="(//div[@class=\"ui-menu-item-wrapper\"])[2]")
	public WebElement india;
	


}
