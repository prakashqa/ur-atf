package com.crm.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.internal.junit.ArrayAsserts;

import com.crm.config.BrowserDriver;
import com.crm.pages.AccoutsPageContainer;
import com.crm.pages.LoginPageContainer;

public class AccountService {
	
	public static AccoutsPageContainer accountPageContainer;
	private static Logger log = Logger.getLogger(AccountService.class.getName());
	
	public AccountService clickOnAccountsTab() {
		accountPageContainer.getDashBoardAccountsLink().click();
		log.info("User clicks Accounts link in Dashbaord page");
		return this;
	}
	
	public AccountService clickOnCreateAccount() {
		accountPageContainer.getCreateAccount().click();
		log.info("Account page has opened");
		return this;
	}
	
	public AccountService insertAccountName(String name) {
		accountPageContainer.getCreateAccountName().sendKeys(name);
		log.info("User inserted account name successfully");
		return this;
	}
	
	public AccountService insertAccountEmail(String email) {
		accountPageContainer.getCreateAccountEmail().sendKeys(email);
		log.info("User inserted accout email");
		return this;
	}
	
	public AccountService insertBillingAddress(String street, String city, String state, String postalCode, String Country) {
		accountPageContainer.getBillingAddressStreet().sendKeys(street);
		accountPageContainer.getBillingAddressCity().sendKeys(city);
		accountPageContainer.getBillingAddressState().sendKeys(state);
		accountPageContainer.getBillingAddressPostalCode().sendKeys(postalCode);
		accountPageContainer.getBillingAddressCountry().sendKeys(Country);
		return this;
	}
	
	public AccountService insertWebsiteAddress(String website) {
		accountPageContainer.getWebsiteAddress().sendKeys(website);
		return this;
	}
		
	public AccountService insertShippingAddress (String street, String city, String state, String postalCode, String Country) {
		accountPageContainer.getShippingAddressStreet().sendKeys(street);
		accountPageContainer.getShippingAddressCity().sendKeys(city);
		accountPageContainer.getShippingAddressState().sendKeys(state);
		accountPageContainer.getShippingAddressPostalCode().sendKeys(postalCode);
		accountPageContainer.getShippingAddressCountry().sendKeys(Country);
		return this;
				
	}
	
	public AccountService clickOnSaveButton() {
		accountPageContainer.getSaveButton().click();
		log.info("User created Account successfully");
		return this;
	}
	
	public String getLoginUserInfo() throws InterruptedException {
		Thread.sleep(4000);
		accountPageContainer.getHomePageMenuBar().click();
		String txt = accountPageContainer.getHomePageUserName().getText();
		System.out.println(txt);
		return txt;
	}
	
	public List<String> getAccountNameAndEmailFromAcountsPage() throws InterruptedException {
		Thread.sleep(6000);
		List<String> list = new ArrayList<String>();
		String txtName = accountPageContainer.accountNameAfterSave.getText();
		String emailTxt = accountPageContainer.emailAddAfterSave.getText();
		
		list.add(txtName);
		list.add(emailTxt);
		//System.out.println("Data from UI:  "+list);
		return list;
		
	}
	public List<String> getBillingAddressFromAccountPage() {
		String bill_adress = accountPageContainer.billingAddressAfterSave.getText();
		
		String new_address = bill_adress.replaceAll(",", "");
		List<String> bi_list = new ArrayList<String>();
		String b_address_raw[] = new_address.split(" ");
		System.out.println(b_address_raw.length);
		for(int i = 0; i < b_address_raw.length; i++ ) {
			Scanner sc = new Scanner(b_address_raw[i]);
			while(sc.hasNextLine()) {
				String bi_line = sc.nextLine();
				bi_list.add(bi_line);
			}
			
		}
		//bi_list.replaceAll(",", "");
		System.out.println(bi_list);
		return bi_list;
	}
	
	/*public String getEmailFileldValue() {
		String txtEmail = accountPageContainer.getCreateAccountEmail().getText();
		System.out.println(txtEmail);
		return txtEmail;
	}
		*/
	//Initialising the page Objects
	public static void init() {
		accountPageContainer = PageFactory.initElements(BrowserDriver.getCurrentDriver(), AccoutsPageContainer.class);
		
	}

}
