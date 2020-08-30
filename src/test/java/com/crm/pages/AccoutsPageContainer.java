package com.crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccoutsPageContainer {
	
	@FindBy(xpath = "//span[normalize-space()='Accounts']")
	public WebElement dashBoardAccountsLink;
	
	@FindBy(xpath = "//a[@data-name='create']")
	public WebElement createAccount;
	
	@FindBy(xpath = "//input[@data-name='name']")
	public WebElement createAccountName;
	
	@FindBy(xpath = "//input[@type='email']")
	public WebElement createAccountEmail;

	@FindBy(xpath = "//textarea[@data-name='billingAddressStreet']")
	public WebElement billingAddressStreet;
	
	@FindBy(xpath = "//input[@data-name='billingAddressCity']")
	public WebElement billingAddressCity;
	
	@FindBy(xpath = "//input[@data-name='billingAddressState']")
	public WebElement billingAddressState;
	
	@FindBy(xpath = "//input[@data-name='billingAddressPostalCode']")
	public WebElement billingAddressPostalCode;
	
	@FindBy(xpath = "//input[@data-name='billingAddressCountry']")
	public WebElement billingAddressCountry;
	
	@FindBy(xpath = "//input[@data-name='website']")
	public WebElement websiteAddress;
	
	@FindBy(xpath ="//textarea[@data-name='shippingAddressStreet']")
	public WebElement shippingAddressStreet;
	
    @FindBy(xpath="//input[@data-name='shippingAddressCity']")
    public WebElement shippingAddressCity;    //ALT+SHIFT+S

	@FindBy(xpath ="//input[@data-name='shippingAddressState']")
	public WebElement shippingAddressState;
	
	@FindBy(xpath = "//input[@data-name='shippingAddressPostalCode']")
	public WebElement shippingAddressPostalCode;
	
	@FindBy(xpath= "//input[@data-name='shippingAddressCountry']")
	public WebElement shippingAddressCountry;
	
	@FindBy(xpath= "//button[@data-action='save']")
	public WebElement saveButton;
	
	@FindBy(id = "nav-menu-dropdown")
	public WebElement homePageMenuBar;

	@FindBy(xpath = "//a[normalize-space()='Admin']")
	public WebElement homePageUserName;
	
    @FindBy(xpath = "//div[@class='field' and @data-name='name']")	
    public WebElement accountNameAfterSave;
    
    @FindBy(xpath="//div[@class='field' and @data-name='emailAddress']")
    public WebElement emailAddAfterSave;
    
    @FindBy(xpath = "//div[@class='field' and @data-name='billingAddress']")
    public WebElement billingAddressAfterSave;

	
	public WebElement getWebsiteAddress() {
		return websiteAddress;
	}

	public void setWebsiteAddress(WebElement websiteAddress) {
		this.websiteAddress = websiteAddress;
	}

	public WebElement getBillingAddressCity() {
		return billingAddressCity;
	}

	public void setBillingAddressCity(WebElement billingAddressCity) {
		this.billingAddressCity = billingAddressCity;
	}

	public WebElement getCreateAccountName() {
		return createAccountName;
	}

	public void setCreateAccountName(WebElement createAccountName) {
		this.createAccountName = createAccountName;
	}

	public WebElement getCreateAccount() {
		return createAccount;
	}

	public void setCreateAccount(WebElement createAccount) {
		this.createAccount = createAccount;
	}

	public WebElement getDashBoardAccountsLink() {
		return dashBoardAccountsLink;
	}

	public void setDashBoardAccountsLink(WebElement dashBoardAccountsLink) {
		this.dashBoardAccountsLink = dashBoardAccountsLink;
	}
	
	public WebElement getCreateAccountEmail() {
		return createAccountEmail;
	}

	public void setCreateAccountEmail(WebElement createAccountEmail) {
		this.createAccountEmail = createAccountEmail;
	}

	public WebElement getBillingAddressStreet() {
		return billingAddressStreet;
	}

	public void setBillingAddressStreet(WebElement billingAddressStreet) {
		this.billingAddressStreet = billingAddressStreet;
	}
	public WebElement getBillingAddressState() {
		return billingAddressState;
	}

	public void setBillingAddressState(WebElement billingAddressState) {
		this.billingAddressState = billingAddressState;
	}
	
	public WebElement getBillingAddressPostalCode() {
		return billingAddressPostalCode;
	}

	public void setBillingAddressPostalCode(WebElement billingAddressPostalCode) {
		this.billingAddressPostalCode = billingAddressPostalCode;
	}

	public WebElement getBillingAddressCountry() {
		return billingAddressCountry;
	}

	public void setBillingAddressCountry(WebElement billingAddressCountry) {
		this.billingAddressCountry = billingAddressCountry;
	}
	public WebElement getShippingAddressStreet() {
		return shippingAddressStreet;
	}

	public void setShippingAddressStreet(WebElement shippingAddressStreet) {
		this.shippingAddressStreet = shippingAddressStreet;
	}
	public WebElement getShippingAddressCity() {
		return shippingAddressCity;
	}

	public void setShippingAddressCity(WebElement shippingAddressCity) {
		this.shippingAddressCity = shippingAddressCity;
	}
	public WebElement getShippingAddressState() {
		return shippingAddressState;
	}

	public void setShippingAddressState(WebElement shippingAddressState) {
		this.shippingAddressState = shippingAddressState;
	}
	public WebElement getShippingAddressPostalCode() {
		return shippingAddressPostalCode;
	}

	public void setShippingAddressPostalCode(WebElement shippingAddressPostalCode) {
		this.shippingAddressPostalCode = shippingAddressPostalCode;
	}
	public WebElement getShippingAddressCountry() {
		return shippingAddressCountry;
	}

	public void setShippingAddressCountry(WebElement shippingAddressCountry) {
		this.shippingAddressCountry = shippingAddressCountry;
	}
	
	public WebElement getSaveButton() {
		return saveButton;
	}

	public void setSaveButton(WebElement saveButton) {
		this.saveButton = saveButton;
	}
	
	public WebElement getHomePageMenuBar() {
		return homePageMenuBar;
	}

	public void setHomePageMenuBar(WebElement homePageMenuBar) {
		this.homePageMenuBar = homePageMenuBar;
	}

	public WebElement getHomePageUserName() {
		return homePageUserName;
	}

	public void setHomePageUserName(WebElement homePageUserName) {
		this.homePageUserName = homePageUserName;
	}

	public WebElement getAccountNameAfterSave() {
		return accountNameAfterSave;
	}

	public void setAccountNameAfterSave(WebElement accountNameAfterSave) {
		this.accountNameAfterSave = accountNameAfterSave;
	}

	public WebElement getEmailAddAfterSave() {
		return emailAddAfterSave;
	}

	public void setEmailAddAfterSave(WebElement emailAddAfterSave) {
		this.emailAddAfterSave = emailAddAfterSave;
	}

	public WebElement getBillingAddressAfterSave() {
		return billingAddressAfterSave;
	}

	public void setBillingAddressAfterSave(WebElement billingAddressAfterSave) {
		this.billingAddressAfterSave = billingAddressAfterSave;
	}
    

}
