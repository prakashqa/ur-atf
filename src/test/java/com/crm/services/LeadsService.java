package com.crm.services;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import com.crm.config.BrowserDriver;
import com.crm.pages.ContactsPageContainer;
import com.crm.pages.LeadsPageContainer;

public class LeadsService {
	
	public static LeadsPageContainer leadsPageContainer;
	
	private static Logger log = Logger.getLogger(LeadsService.class.getName());
	
	public LeadsService clickOnLeadsTab() {
		leadsPageContainer.getDashBoardLeadsLink().click();
		log.info("User clicks Leads link in Dashbaord page");
		return this;
	}
	public LeadsService clickOnCreateLead() {
		leadsPageContainer.getCreateLead().click();
		return this;
	}

	
//	public LeadsService selectValueFromNameDropdown(String value) {
//		BrowserDriver.selectValueFormDropdown(leadsPageContainer.getNameDropDown(), value);
//		return this;
//	}
	
	public LeadsService insertFirstNameAndLastName(String name) {
		leadsPageContainer.getFirstName().sendKeys(name);
		leadsPageContainer.getLastName().sendKeys(name);
		return this;
	}
	public LeadsService insertEmailAndTitle(String email, String Title) {
		leadsPageContainer.getEmail().sendKeys(email);
		leadsPageContainer.getTitle().sendKeys(Title);
		return this;
	}
	//public LeadsService 
	
	
	
	public static void init() {
		leadsPageContainer = PageFactory.initElements(BrowserDriver.getCurrentDriver(), LeadsPageContainer.class);
	}

	
	
	
	
	
	
	

}
