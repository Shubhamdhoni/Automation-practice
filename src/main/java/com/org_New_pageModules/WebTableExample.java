package com.org_New_pageModules;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.org_New_beforeComponents.BrowserActionNew;

public class WebTableExample extends BrowserActionNew {
	
	public WebDriver driver;

	public WebTableExample(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//legend[text()='Web Table Example']")
	public WebElement webTableExample;
	
	@FindBy(xpath="//table[@name='courses']")
	public List<WebElement> Table;
	
	public void GetAllText() {
		
		  List<WebElement> subElements = Table;
	        for (WebElement element : subElements) {
	        	System.out.println(element.getText());
	        }
		
	}

}
