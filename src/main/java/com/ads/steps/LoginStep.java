package com.ads.steps;

import java.io.IOException;

import org.testng.annotations.Test;

import com.ads.page.LoginPage;
import com.ads.page.registerPage;
import com.ads.util.*;

public class LoginStep extends Base {
	
	@Test
	public void pageNavigation() throws InterruptedException {
		try {
		
			BROWSER = initializDriver();
			BROWSER.get("http://www.qbakbak.com/");
			LoginPage l=new LoginPage(BROWSER);
			l.getLogin();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
	}

}
