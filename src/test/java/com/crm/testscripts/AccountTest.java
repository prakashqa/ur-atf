package com.crm.testscripts;

import java.util.List;

//import org.sikuli.script.FindFailed;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.config.BrowserDriver;
import com.crm.config.PropertyLoader;
import com.crm.data.CrmLoginData;
import com.crm.data.CrmTestData;
import com.crm.data.LoginData;
import com.crm.services.AccountService;
import com.crm.services.ContactsService;
import com.crm.services.EmailService;
import com.crm.services.LoginService;
import com.crm.utils.BaseListener;
import com.crm.validators.CrmValidator;
  

public class AccountTest {
	
	LoginService loginService = null;
	AccountService accountService = null;
	ContactsService contactsService= null;
	EmailService emailService = null;
	CrmValidator crmValidator = null;
	
	CrmLoginData crmLoginData = null;
	List<LoginData> appData = null;
	
	@BeforeClass
	public void init() {
		loginService = new LoginService();
		accountService = new AccountService();
		contactsService = new ContactsService();
		emailService = new EmailService();
		crmValidator = new CrmValidator();
		
		crmLoginData = CrmTestData.getTestData();
		appData = crmLoginData.getCrmlogindata();
		
		InitilizeViews.init();
		BrowserDriver.getCurrentDriver().navigate().to(PropertyLoader.getQaUrl());
		loginService.insertUserName(appData.get(0).getUsername()).insertPassword(appData.get(0).getPassword()).clickOnLogin();
	}
	
	@Test(description = "Create Account with Billing Address using positive data", priority=0)
	public void createAccountTest() throws InterruptedException {
		crmValidator.validateLoginUser(accountService);
		accountService.clickOnAccountsTab().clickOnCreateAccount().insertAccountName(appData.get(0).getAccountName()).insertAccountEmail(appData.get(0).getAccountEmail());
		
		//crmValidator.validateNameField(accountService);
		accountService.insertBillingAddress(appData.get(0).getBillingStreet(), appData.get(0).getBillingCity(), appData.get(0).getBillingState(), appData.get(0).getBillingPostalCode(), appData.get(0).getBillingCountry());
		
		accountService.insertWebsiteAddress(appData.get(0).getAccountWebsite());
		
		accountService.insertShippingAddress(appData.get(0).getShippingStreet(), appData.get(0).getShippingCity(), appData.get(0).getShippingState(), appData.get(0).getShippingPostalCode(), appData.get(0).getShippingCountry());
	
		accountService.clickOnSaveButton();	
		
		crmValidator.validateAccountNameAndEmail(accountService);
		//accountService.getBillingAddressFromAccountPage();
		
		crmValidator.validateAccountBillingAddress(accountService);
		
	}
	
	//@Test(description = "Create Account with Billing Address using positive data", priority=1)
	public void createAountTest2() {
		//accountService.clickOnAccountsTab().clickOnCreateAccount().insertAccountName(appData.get(index))
	}
	
	//@Test(description = "Create Contacts with Address using positive data", priority=1)	
	public void createContactTest() {
		contactsService.clickOnContactsTab().clickOnCreateContact().selectValueFromNameDropdown(appData.get(0).getName()).insertContactFirstNameandLastName(appData.get(0).getContactFirstName(), appData.get(0).getContactLastName());
		contactsService.insertEmail(appData.get(0).getContactEmail());
		contactsService.insertAddress(appData.get(0).getContactAddressStreet(), appData.get(0).getContactAddressCity(), appData.get(0).getContactAddressState(), appData.get(0).getContactAddressPostalCode(), appData.get(0).getContactAddressCountry());
		contactsService.insertDescription(appData.get(0).getContactDescription()).selectNameFromAccountsDropDown();//insertMobileNumber(appData.get(0).getContactMobilenumber());
		contactsService.selectvalueFromAssignedUser();
	}
	
//	@Test(description = "Compose Email Test")
//	public void composeAnEmail() throws FindFailed, InterruptedException {
//		emailService.navigateComposeEmail().attachFilesToEmail();
//	}
	
	
	
	
}
