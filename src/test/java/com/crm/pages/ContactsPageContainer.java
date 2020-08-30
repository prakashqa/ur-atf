package com.crm.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactsPageContainer {
	
	@FindBy(xpath = "//span[text()='Contacts']")
	public WebElement dashBoardContactsLink;
	
	@FindBy(xpath = "//a[@data-name='create']")
	public WebElement createContact;
	
    @FindBy(xpath = "//select[@data-name='salutationName']")
	//@FindBy(xpath = "//select[@data-name='salutationName']//option")
	public WebElement nameDropdown;
   
   @FindBy(xpath="//input[@data-name='firstName']")
   public WebElement firstName;
   
   @FindBy(xpath= "//input[@data-name='lastName']")
   public WebElement lastName;
   
   @FindBy(xpath = "//input[@type='email']")
   public WebElement email;
   
   @FindBy(xpath = "//textarea[@data-name='addressStreet']")
    public WebElement addressStreet;
	
   @FindBy(xpath = "//input[@data-name='addressCity']")
   public WebElement addressCity;
   
   @FindBy(xpath = "//input[@data-name='addressState']")
   public WebElement addressState;
   
   @FindBy(xpath = "//input[@data-name='addressPostalCode']")
   public WebElement addressPostalCode;
   
   @FindBy(xpath = "//input[@data-name='addressCountry']")
   public WebElement addressCountry;
	
	@FindBy(xpath = "//textarea[@data-name='description']")
	public WebElement description;
	
	//@FindBy(xpath = "//input[contains(@autocomplete,'espo-accounts')]")
	//public WebElement accountsDropDown;
	
	@FindBy(xpath = "(//span[@class='input-group-btn']//button[contains(@title, 'Select')])[position()=1]")
	public WebElement accountsDropDownButton;
	
	@FindBy(xpath = "//input[@class='form-control phone-number no-margin-shifting']")
	public WebElement mobilenumber;

	@FindBy(xpath = "//a[text()='UmaDevi']//preceding::td")
	public WebElement selectAccountName;
	
	@FindBy(xpath = "//button[@data-name='select']")
	public WebElement selectButton;
	
	@FindBy(xpath ="(//input[@data-name='assignedUserName']//following::button[@data-action='selectLink'])[position()=1]")
	public WebElement AssignedUserButton;

	@FindBy(xpath = "//a[@class='link']")
	public WebElement selectvalueAssignedButton;
	
	@FindBy(xpath = "//button[@data-action='save']")
	public WebElement SaveButton;
	
	public WebElement getDashBoardContactsLink() {
		return dashBoardContactsLink;
	}

	public void setDashBoardContactsLink(WebElement dashBoardContactsLink) {
		this.dashBoardContactsLink = dashBoardContactsLink;
	}

	public WebElement getCreateContact() {
		return createContact;
	}

	public void setCreateContact(WebElement createContact) {
		this.createContact = createContact;
	}

	public WebElement getNameDropdown() {
		return nameDropdown;
	}

	public void setNameDropdown(WebElement nameDropdown) {
		this.nameDropdown = nameDropdown;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public void setFirstname(WebElement firstName) {
		this.firstName = firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public void setLastname(WebElement lastName) {
		this.lastName = lastName;
	}

	public WebElement getEmail() {
		return email;
	}

	public void setEmail(WebElement email) {
		this.email = email;
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

	public void setAddresscountry(WebElement addressCountry) {
		this.addressCountry = addressCountry;
	}

	public WebElement getDescription() {
		return description;
	}

	public void setDescription(WebElement description) {
		this.description = description;
	}

	/*public WebElement getAccountsDropDown() {
		return accountsDropDown;
	}

	public void setAccountsDropDown(WebElement accountsDropDown) {
		this.accountsDropDown = accountsDropDown;
	}*/

	public WebElement getMobilenumber() {
		return mobilenumber;
	}

	public void setMobilenumber(WebElement mobilenumber) {
		this.mobilenumber = mobilenumber;
	}

	public WebElement getAccountsDropDownButton() {
		return accountsDropDownButton;
	}

	public void setAccountsDropDownButton(WebElement accountsDropDownButton) {
		this.accountsDropDownButton = accountsDropDownButton;
	}

	public WebElement getSelectAccountName() {
		return selectAccountName;
	}

	public void setSelectAccountName(WebElement selectAccountName) {
		this.selectAccountName = selectAccountName;
	}

	public WebElement getSelectButton() {
		return selectButton;
	}

	public void setSelectButton(WebElement selectButton) {
		this.selectButton = selectButton;
	}

	public WebElement getAssignedUserButton() {
		return AssignedUserButton;
	}

	public void setAssignedUserButton(WebElement assignedUserButton) {
		AssignedUserButton = assignedUserButton;
	}

	public WebElement getSelectvalueAssignedButton() {
		return selectvalueAssignedButton;
	}

	public void setSelectvalueAssignedButton(WebElement selectvalueAssignedButton) {
		this.selectvalueAssignedButton = selectvalueAssignedButton;
	}

	public WebElement getSaveButton() {
		return SaveButton;
	}

	public void setSaveButton(WebElement saveButton) {
		SaveButton = saveButton;
	}

	
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	