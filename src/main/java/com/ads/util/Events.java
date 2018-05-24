package com.ads.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Events {
	public static WebDriver BROWSER;

	public Events(WebDriver BROWSER) {
		// TODO Auto-generated constructor stub
		this.BROWSER = BROWSER;
	}



	public static String setClick(WebElement objectName) {
		// TODO Auto-generated method stub
		objectName.sendKeys("2323");
		return null;
	}



	public static WebElement setClick(By signin) {
		// TODO Auto-generated method stub
		return null;
	}

	// public void perform(String objectName, String objectType, String value)
	// throws Exception {
	// System.out.println("");
	// switch (operation.toUpperCase()) {
	// case "CLICK":
	// // Perform click
	// BROWSER.findElement(this.getObject(p, objectName, objectType)).click();
	// break;
	// case "SETTEXT":
	// // Set text on control
	// BROWSER.findElement(this.getObject(p, objectName,
	// objectType)).sendKeys(value);
	// break;
	//
	// case "GOTOURL":
	// // Get url of application
	// BROWSER.get(p.getProperty(value));
	// break;
	// case "GETTEXT":
	// // Get text of an element
	// BROWSER.findElement(this.getObject(p, objectName, objectType)).getText();
	// break;
	// default:
	// break;
	// }
	// }

}
