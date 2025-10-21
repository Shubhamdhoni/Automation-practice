package com.org_New_pageModules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.org_New_beforeComponents.BrowserActionNew;

public class DropdownExample extends BrowserActionNew {
	
	public WebDriver driver;

	public DropdownExample(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	 @FindBy(xpath="//legend[text()='Dropdown Example']")
	    public WebElement DropdownExample2;
	    @FindBy(xpath="//select[@id='dropdown-class-example']")
	    public WebElement drop;
	   


}
