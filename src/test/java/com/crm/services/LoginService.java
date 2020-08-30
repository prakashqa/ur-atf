package com.crm.services;

import org.openqa.selenium.support.PageFactory;

import com.crm.config.BrowserDriver;
import com.crm.pages.LoginPageContainer;

public class LoginService {
	
	public static LoginPageContainer loginPageContainer;
	
	public LoginService insertUserName(String uname) {
		loginPageContainer.getLoginUserName().sendKeys(uname);
		return this;
	}
	
	public LoginService insertPassword(String pword) {
		loginPageContainer.getLoginPassWord().sendKeys(pword);
		return this;
	}
	
	public LoginService clickOnLogin() {
		loginPageContainer.getLoginButton().click();
		return this;
	}
	
	public static void init() {
		loginPageContainer = PageFactory.initElements(BrowserDriver.getCurrentDriver(), LoginPageContainer.class);
	}

}
