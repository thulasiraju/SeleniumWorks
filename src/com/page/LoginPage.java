package com.page;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{
	
	Logger log=Logger.getLogger("Entity Page");
	static  WebDriver driver;
	public LoginPage(WebDriver driver) {
		LoginPage.driver = driver;
		 PageFactory.initElements(driver, this);
	}

	
	@FindBy(id="Email")
	public WebElement Email;
	
	@FindBy(id="Password")
	public WebElement Password;
	
	@FindBy(id="loginbtn")
	public  WebElement LoginButton;
	
	

}
