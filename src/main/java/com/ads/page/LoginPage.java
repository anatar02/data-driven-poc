package com.ads.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.ads.util.Events;

public class LoginPage extends Events{

	public LoginPage(WebDriver BROWSER) {
		super(BROWSER);
		// TODO Auto-generated constructor stub
	}



	public WebDriver BROWSER;

	By signin = By.id("firstnamecheck");



	public WebElement getLogin() {
		return Events.setClick(signin);
		
	}

	

}
