package com.spicejet.guidelines;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class Events {
	
	
	/**
	 * @author rayap
	 * @param textElement is a WebElement 
	 * @param text value to set in the textBox
	 */
	
	public static void SendText(WebElement textElement,String text) {
		if(textElement.isDisplayed()) {
			if(textElement.isEnabled()) {
				textElement.clear();
				textElement.sendKeys(text);
			}else {
				System.out.println("FAIL: WebElement "+textElement.toString()+" is not enabled");
			}
		}else {
			System.out.println("Fail: WebElement "+textElement.toString() +" is not displayed");
		}
	}
	/**
	 * @author rayap
	 * @param elem
	 * This method is used to click a Webelement provided with By type Input
	 */
	public static void ClickElem(By elem) {
		WebElement clickelem=Data.driver.findElement(elem);
		if(clickelem.isDisplayed()) {
			if(clickelem.isEnabled()) {
		clickelem.click();
			}else {
				System.out.println("FAIL: Webelement "+clickelem.toString()+" is not enabled to click");
			}
		}else {
			System.out.println("FAIL: WebElement "+clickelem.toString()+" is not displayed in the UI");
		}
		
	}

}
