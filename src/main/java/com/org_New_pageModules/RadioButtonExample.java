package com.org_New_pageModules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.org_New_beforeComponents.BrowserActionNew;

public class RadioButtonExample extends BrowserActionNew{
	
	public WebDriver driver;

	public RadioButtonExample(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//legend[text()='Radio Button Example']")
	public WebElement RadioButtonExample;
	@FindBy(xpath="//div[@class='left-align']//label[2]")
	public WebElement Radio2;
	
	//
/*	@FindBy(xpath="//legend[text()='Suggession Class Example']")
	public WebElement SuggessionClassExample;
	@FindBy(xpath="(//input[@type='text'])[1]")
	public WebElement suggession;
	@FindBy(xpath="(//div[@class=\"ui-menu-item-wrapper\"])[2]")
	public WebElement india;
	
	//
    @FindBy(xpath="//legend[text()='Dropdown Example']")
    public WebElement DropdownExample;
    @FindBy(xpath="//select[@id='dropdown-class-example']")
    public WebElement drop;
    
    //
	@FindBy(xpath="//legend[text()='Checkbox Example']")
	public WebElement CheckboxExample;
	@FindBy(xpath="//input[@value='option1']")
	public WebElement CheckboxOption1;
	@FindBy(xpath="//input[@value='option2']")
	public WebElement CheckboxOption2;
	@FindBy(xpath="//input[@value='option3']")
	public WebElement CheckboxOption3;
*/	
	
	
	
	
	
	
	
	
	
	
	
}
