package com.org_New_beforeComponents;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BrowserActionNew {
	

	public void sendKeys(WebElement element,String value) {
		element.sendKeys(value);	
	}
	
	public void clicks (WebElement element) {
		element.click();
	}
	
	public String GetText (WebElement element) {
		return element.getText();
	}
	

	// DropDown 
	           //Select by index
	public void selectbyindex(WebElement element,int index) {
		Select sel = new Select(element);
		sel.selectByIndex(index);
	}
	
	           //Select by values
	public void selectbyValues(WebElement element,String Value) {
		Select sel = new Select(element);
		sel.selectByValue(Value);
	}
	
              // Select by VisibleText 	
	public void selectByVisibleText(WebElement element , String Text) {
		Select sel = new Select(element);
		sel.selectByVisibleText(Text);
	}
	
            // clear text
	public void clearText(WebElement element) {
	    element.clear();
	}

	
	
	public void switchWindow(WebDriver driver) {
		
		 String win1 = driver.getWindowHandle();
		    Set<String> win2 = driver.getWindowHandles();
		    for(String win : win2) {		
				if(!win.equals(win1)) {
					driver.switchTo().window(win);
				}
		    }
	}
}


