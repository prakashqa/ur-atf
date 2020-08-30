package com.crm.validators;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;

import com.crm.data.CrmLoginData;
import com.crm.data.CrmTestData;
import com.crm.data.LoginData;
import com.crm.services.AccountService;

public class CrmValidator {

	CrmLoginData crmLoginData = CrmTestData.getTestData();
	List<LoginData> appData = crmLoginData.getCrmlogindata();

	public void validateLoginUser(AccountService accountService) throws InterruptedException {
		String user = appData.get(0).getUsername();
		String txtUser = accountService.getLoginUserInfo();

		Assert.assertTrue(txtUser.equalsIgnoreCase(user));
	}

	public void validateAccountNameAndEmail(AccountService accountService) throws InterruptedException {
		List<String> ui_list = accountService.getAccountNameAndEmailFromAcountsPage();
		
		List<String> list_xml = new ArrayList<String>();
        
		String name = appData.get(0).getAccountName();
		String email = appData.get(0).getAccountEmail();
        list_xml.add(name);
        list_xml.add(email);
        
        //System.out.println("Data from Xml: "+list_xml);
		Assert.assertEquals(ui_list, list_xml);
	}
	
	public void validateAccountBillingAddress(AccountService accountService) {
		List<String> billing_address = accountService.getBillingAddressFromAccountPage();
		
		List<String> list_xml = new ArrayList<String>();
		String street = appData.get(0).getBillingStreet();
		String city = appData.get(0).getBillingCity();
		String state = appData.get(0).getBillingState();
		String postal = appData.get(0).getBillingPostalCode();
		String country = appData.get(0).getBillingCountry();
		
		list_xml.add(street);
		list_xml.add(city);
		list_xml.add(state);
		list_xml.add(postal);
		list_xml.add(country);
		
		System.out.println(list_xml);
		
		Assert.assertEquals(billing_address, list_xml);
	}

}
	