package com.crm.services;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
//import org.sikuli.script.FindFailed;
//import org.sikuli.script.Screen;

import com.crm.config.BrowserDriver;
import com.crm.pages.AccoutsPageContainer;
import com.crm.pages.EmailsPageContainer;

public class EmailService {
	
	public static EmailsPageContainer emailsPageContainer;
	private static Logger log = Logger.getLogger(EmailService.class.getName());
	
	//Screen screen = new Screen();
	
	
	public EmailService navigateComposeEmail() {
		emailsPageContainer.getDashBoardEmails().click();
		emailsPageContainer.getComposeEmail().click();
		return this;
	}
	
//	public EmailService attachFilesToEmail() throws FindFailed, InterruptedException {
//		Thread.sleep(6000);
//		screen.click("C:\\Uma-Artifacts\\Live-Project\\crm-atf\\Sikuli-Objects\\attach.PNG");
//		Thread.sleep(2000);
//		screen.click("C:\\Uma-Artifacts\\Live-Project\\crm-atf\\Sikuli-Objects\\desktop.PNG");
//		Thread.sleep(2000);
//		screen.doubleClick("C:\\Uma-Artifacts\\Live-Project\\crm-atf\\Sikuli-Objects\\nav.PNG");
//		Thread.sleep(2000);
//		screen.click("C:\\Uma-Artifacts\\Live-Project\\crm-atf\\Sikuli-Objects\\cons.PNG");
//		Thread.sleep(2000);
//		screen.click("C:\\Uma-Artifacts\\Live-Project\\crm-atf\\Sikuli-Objects\\open.PNG");
//		return this;
//	}

	
	public static void init() {
		emailsPageContainer = PageFactory.initElements(BrowserDriver.getCurrentDriver(), EmailsPageContainer.class);
		
	}

}
