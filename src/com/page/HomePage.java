package com.page;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage extends BasePage{

	Logger log=Logger.getLogger("Entity Page");
	static  WebDriver driver;
	public HomePage(WebDriver driver) {
		HomePage.driver = driver;
		 PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath="//a[@title='Click to logout']")
	public static WebElement LogoutButton;
}
