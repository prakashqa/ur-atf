package com.crm.services;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import com.crm.config.BrowserDriver;
import com.crm.pages.ContactsPageContainer;

public class ContactsService {

	public static ContactsPageContainer contactsPageContainer;

	private static Logger log = Logger.getLogger(ContactsService.class.getName());

	public ContactsService clickOnContactsTab() {
		contactsPageContainer.getDashBoardContactsLink().click();
		log.info("User clicks Contacts link in Dashbaord page");
		return this;
	}

	public ContactsService clickOnCreateContact() {
		contactsPageContainer.getCreateContact().click();
		return this;
	}

	public ContactsService selectValueFromNameDropdown(String text) {

		// contactsPageContainer.getNameDropdown();
		BrowserDriver.selectValueFromDropdownByVisibleText(contactsPageContainer.getNameDropdown(), text);
		return this;
	}
	
	public ContactsService insertContactFirstNameandLastName(String firstName, String lastName) {
		contactsPageContainer.getFirstName().sendKeys(firstName);
		contactsPageContainer.getLastName().sendKeys(lastName);
		
		return this;
	}
	public ContactsService insertEmail(String email) {
		contactsPageContainer.getEmail().sendKeys(email);
		return this;
	}
	public ContactsService insertAddress(String street, String city, String state, String postalCode, String country) {
		contactsPageContainer.getAddressStreet().sendKeys(street);
		contactsPageContainer.getAddressCity().sendKeys(city);
		contactsPageContainer.getAddressState().sendKeys(state);
		contactsPageContainer.getAddressPostalCode().sendKeys(postalCode);
		contactsPageContainer.getAddressCountry().sendKeys(country);
		return this;
	}
	public ContactsService insertDescription(String description) {
		contactsPageContainer.getDescription().sendKeys(description);
		return this;
	}
	public ContactsService selectNameFromAccountsDropDown() {
		contactsPageContainer.getAccountsDropDownButton().click();
		contactsPageContainer.getSelectAccountName().click();
		contactsPageContainer.getSelectButton().click();
		return this;
		}
    /* public ContactsService insertMobileNumber(long mobileNumber) {
    	 contactsPageContainer.getMobilenumber().sendKeys(mobileNumber);
    	 return this;
     }*/
	
	public ContactsService selectvalueFromAssignedUser() {
		contactsPageContainer.getAssignedUserButton().click();
		contactsPageContainer.getSelectvalueAssignedButton().click();
		contactsPageContainer.getSaveButton().click();
		return this;
	}
	public static void init() {
		contactsPageContainer = PageFactory.initElements(BrowserDriver.getCurrentDriver(), ContactsPageContainer.class);
	}

}
