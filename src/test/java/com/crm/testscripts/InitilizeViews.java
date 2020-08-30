package com.crm.testscripts;

import org.openqa.selenium.WebDriver;

import com.crm.config.BrowserDriver;
import com.crm.services.AccountService;
import com.crm.services.ContactsService;
import com.crm.services.EmailService;
import com.crm.services.LoginService;

public class InitilizeViews {
	
	public static WebDriver driver = null;
	
	static void init() {
		driver = BrowserDriver.getCurrentDriver();
		LoginService.init();
		AccountService.init();
		ContactsService.init();
		EmailService.init();

	}

}
