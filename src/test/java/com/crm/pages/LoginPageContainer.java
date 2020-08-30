package com.crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageContainer {
	
	@FindBy(id = "field-userName")
	public WebElement loginUserName;
	
	@FindBy (id = "field-password")
	public WebElement loginPassWord;
	
	@FindBy(id = "btn-login")
	public WebElement loginButton;
	
	public WebElement getLoginButton() {
		return loginButton;
	}

	public void setLoginButton(WebElement loginButton) {
		this.loginButton = loginButton;
	}

	public WebElement getLoginPassWord() {
		return loginPassWord;
	}

	public void setLoginPassWord(WebElement loginPassWord) {
		this.loginPassWord = loginPassWord;
	}

	public WebElement getLoginUserName() {
		return loginUserName;
	}

	public void setLoginUserName(WebElement loginUserName) {
		this.loginUserName = loginUserName;
	}

}
