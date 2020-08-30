package com.crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmailsPageContainer {
	
	public WebElement getDashBoardEmails() {
		return dashBoardEmails;
	}

	public void setDashBoardEmails(WebElement dashBoardEmails) {
		this.dashBoardEmails = dashBoardEmails;
	}

	public WebElement getComposeEmail() {
		return composeEmail;
	}

	public void setComposeEmail(WebElement composeEmail) {
		this.composeEmail = composeEmail;
	}

	@FindBy(xpath = "//span[normalize-space()='Emails']")
	public WebElement dashBoardEmails;
	
	@FindBy(xpath = "//a[normalize-space()='Compose']")
	public WebElement composeEmail;
}
