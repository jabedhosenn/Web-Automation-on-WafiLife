package pages;

import static utilities.DriverSetup.getDriver;

import java.io.ByteArrayInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


import io.qameta.allure.Allure;

public class BasePage {
	
	public WebElement getElement(By locator) {
		return getDriver().findElement(locator);	
	}
	
	public void writeText(By locator, String text) {
		getElement(locator).sendKeys(text);	
	}
	
	public void clickOnElement(By locator) {
		getElement(locator).click();	
	}
	
	public void takeScreenShot(String name) {
		Allure.addAttachment(name, new ByteArrayInputStream(((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.BYTES)));
	}
	
	public void scrollIntoElement(By locator) {
		WebElement el = getElement(locator);
		JavascriptExecutor js = (JavascriptExecutor)getDriver();
		js.executeScript("arguments[0].scrollIntoView();", el);
		
	}
	
	public void dropDownWithValue(By locator, String value){
        Select select = new Select(getElement(locator));
        select.selectByVisibleText(value);
    }

    public void dropDownWithIndex(By locator, int value){
        Select select = new Select(getElement(locator));
        select.selectByIndex(value);
    }
          
    public void selectElementWithText(By locator, String text) {
    	writeText(locator, text);
    	getElement(locator).sendKeys(Keys.ARROW_DOWN);
    	getElement(locator).sendKeys(Keys.ENTER);
    }
	
		
}
