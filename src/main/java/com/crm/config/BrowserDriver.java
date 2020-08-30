package com.crm.config;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.UnreachableBrowserException;
import org.openqa.selenium.support.ui.Select;

public class BrowserDriver {
	
	private static WebDriver mDriver;
	
	public static WebDriver getCurrentDriver(String browserType) {
		if (mDriver == null) {
			try {
				mDriver = BrowserFactory.getBrowser(browserType);
			} catch(UnreachableBrowserException e) {
				e.printStackTrace();
			}
		}
		return mDriver;
	}
	
	public static WebDriver getCurrentDriver() {
		return getCurrentDriver(PropertyLoader.getBrowserType());
	}
	
	public static void takeScreenShot() {
		//1. take screenshot and store it as a file format
		try {
			String newFileNamePtath;
			File directory = new File(".");
			//create time stamp format 
			DateFormat dateFormat = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ssaa");
			//current date
			Date date = new Date();
			
			//appending file format and date format to the screen shot
			newFileNamePtath = directory.getCanonicalPath() + "\\screenshots\\" + dateFormat.format(date) + "_" + ".jpg";
			File  file = new File(newFileNamePtath);
			File srcFile = ((TakesScreenshot)getCurrentDriver()).getScreenshotAs(OutputType.FILE);
			
			FileUtils.copyFile(srcFile, new File(newFileNamePtath));
			
				//FileUtils.copyFile(srcFile, new File("C:\\Uma-Artifacts\\Live-Project\\crm-atf\\screenshots\\" +testMethodName+ ".jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
//	public static void selectValueFormDropdown(WebElement webelement, String value, int index) {
//
//		Select select = new Select(webelement);
//		List<WebElement> dropList = select.getOptions();
//		switch (value) {
//		case "ByVisibleText":
//			
//			select.selectByVisibleText(value);
//			break;
//
//		case "ByIndex":
//			select.selectByIndex(index);
//			break;
//
//		case "ByValue":
//			select.selectByValue(value);
//			break;
//			
//			System.out.println(dropList.size());
//			System.out.println("Total Options are" + dropList.size());
//			for (int i = 0; i < dropList.size(); i++) {
//				String dropDownValue = dropList.get(i).getText();
//				System.out.println(dropDownValue);
//
//				if (dropList.get(0).getText().equals(value)) {
//					dropList.get(i).click();
//					break;
//
//				}
//
//			}
//		}
//
//	}
	
	public static void selectValueFromDropdownByVisibleText(WebElement webelement, String value) {
		Select select = new Select(webelement);
		select.selectByVisibleText(value);
	}

}
 