package com.crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LeadsPageContainer {
	
	@FindBy(xpath = "//span[text()='Leads']")
	public WebElement dashBoardLeadsLink;
	
	@FindBy(xpath = "//a[@data-name='create']")
	public WebElement createLead;
	
	//@FinBy(xpath = "//select[@data-name='salutationName']//option[@value='Mr.']")
	@FindBy(xpath ="//select[@data-name='salutationName']")
	public WebElement nameDropDown;
	
	@FindBy(xpath = "//input[@data-name='firstName']")
	public WebElement firstName;
	
	@FindBy(xpath = "//input[@data-name='lastName']")
	public WebElement lastName;
	
	@FindBy(xpath ="//input[@type='type']")
	public WebElement email;
	
	@FindBy(xpath = "//input[@class='form-control global-search-input']")
	public WebElement title;
	
	@FindBy(xpath ="//textarea[@data-name='addressStreet']")
	public WebElement addressStreet;
	
	@FindBy(xpath = "//input[@data-name='addressCity']")
	public WebElement addressCity;
	
	@FindBy(xpath = "//input[@data-name='addressState']")
	public WebElement addressState;
	
	@FindBy(xpath ="//input[@data-name='addressPostalCode']")
	public WebElement addressPostalCode;
	
	@FindBy(xpath ="//input[@data-name='addressCountry']")
	public WebElement addressCountry;
	
	@FindBy(xpath = "//select[@data-name='status']")
	public WebElement status;
	
	@FindBy(xpath ="//input[@data-name='opportunityAmount']")
	public WebElement opportunityAmount;
	
	@FindBy(xpath ="//select[@data-name='industry']")
	public WebElement industry;
	
	@FindBy(xpath="//textarea[@data-name='description']")
	public WebElement description;
	
	@FindBy(xpath ="//input[@data-name='accountName']")
	public WebElement accountName;
	
	@FindBy(xpath ="(//input[@type='input']//preceding::select)[position()=2]")
	public WebElement MobileNumberDropDown;
	
	@FindBy(xpath ="//input[@type='input']")
	public WebElement MobileNumber;
	
	@FindBy(xpath ="//input[@data-name='website']")
	public WebElement website;
	
	@FindBy(xpath ="(//input[@data-name='assignedUserName']//following::button[@data-action='selectLink'])[position()=1]")
	public WebElement assignedUser;
	
	@FindBy(xpath ="//a[@class='link']")
	public WebElement selectvalueAssignedButton;
	
	@FindBy(xpath="(//input[@autocomplete='espo-teams']//following::button[@data-action='selectLink'])[position()=1]")
	public WebElement teams;
	
	@FindBy(xpath ="//button[@data-name='cancel']")
    public WebElement cancelButton;
	
	@FindBy(xpath="//button[@data-action='save']")
	public WebElement saveButton;

	public WebElement getDashBoardLeadsLink() {
		return dashBoardLeadsLink;
	}

	public void setDashBoardLeadsLink(WebElement dashBoardLeadsLink) {
		this.dashBoardLeadsLink = dashBoardLeadsLink;
	}

	public WebElement getCreateLead() {
		return createLead;
	}

	public void setCreateLead(WebElement createLead) {
		this.createLead = createLead;
	}

	public WebElement getNameDropDown() {
		return nameDropDown;
	}

	public void setNameDropDown(WebElement nameDropDown) {
		this.nameDropDown = nameDropDown;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public void setFirstName(WebElement firstName) {
		this.firstName = firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public void setLastName(WebElement lastName) {
		this.lastName = lastName;
	}

	public WebElement getEmail() {
		return email;
	}

	public void setEmail(WebElement email) {
		this.email = email;
	}

	public WebElement getTitle() {
		return title;
	}

	public void setTitle(WebElement title) {
		this.title = title;
	}

	public WebElement getAddressStreet() {
		return addressStreet;
	}

	public void setAddressStreet(WebElement addressStreet) {
		this.addressStreet = addressStreet;
	}

	public WebElement getAddressCity() {
		return addressCity;
	}

	public void setAddressCity(WebElement addressCity) {
		this.addressCity = addressCity;
	}

	public WebElement getAddressState() {
		return addressState;
	}

	public void setAddressState(WebElement addressState) {
		this.addressState = addressState;
	}

	public WebElement getAddressPostalCode() {
		return addressPostalCode;
	}

	public void setAddressPostalCode(WebElement addressPostalCode) {
		this.addressPostalCode = addressPostalCode;
	}

	public WebElement getAddressCountry() {
		return addressCountry;
	}

	public void setAddressCountry(WebElement addressCountry) {
		this.addressCountry = addressCountry;
	}

	public WebElement getStatus() {
		return status;
	}

	public void setStatus(WebElement status) {
		this.status = status;
	}

	public WebElement getOpportunityAmount() {
		return opportunityAmount;
	}

	public void setOpportunityAmount(WebElement opportunityAmount) {
		this.opportunityAmount = opportunityAmount;
	}

	public WebElement getIndustry() {
		return industry;
	}

	public void setIndustry(WebElement industry) {
		this.industry = industry;
	}

	public WebElement getDescription() {
		return description;
	}

	public void setDescription(WebElement description) {
		this.description = description;
	}

	public WebElement getAccountName() {
		return accountName;
	}

	public void setAccountName(WebElement accountName) {
		this.accountName = accountName;
	}

	public WebElement getMobileNumberDropDown() {
		return MobileNumberDropDown;
	}

	public void setMobileNumberDropDown(WebElement mobileNumberDropDown) {
		MobileNumberDropDown = mobileNumberDropDown;
	}

	public WebElement getMobileNumber() {
		return MobileNumber;
	}

	public void setMobileNumber(WebElement mobileNumber) {
		MobileNumber = mobileNumber;
	}

	public WebElement getWebsite() {
		return website;
	}

	public void setWebsite(WebElement website) {
		this.website = website;
	}

	public WebElement getAssignedUser() {
		return assignedUser;
	}

	public void setAssignedUser(WebElement assignedUser) {
		this.assignedUser = assignedUser;
	}

	public WebElement getSelectvalueAssignedButton() {
		return selectvalueAssignedButton;
	}

	public void setSelectvalueAssignedButton(WebElement selectvalueAssignedButton) {
		this.selectvalueAssignedButton = selectvalueAssignedButton;
	}

	public WebElement getTeams() {
		return teams;
	}

	public void setTeams(WebElement teams) {
		this.teams = teams;
	}

	public WebElement getCancelButton() {
		return cancelButton;
	}

	public void setCancelButton(WebElement cancelButton) {
		this.cancelButton = cancelButton;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}

	public void setSaveButton(WebElement saveButton) {
		this.saveButton = saveButton;
	}
	
	
}
