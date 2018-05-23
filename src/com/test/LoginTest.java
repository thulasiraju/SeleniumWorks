package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.page.HomePage;
import com.page.LoginPage;

public class LoginTest extends BaseTest{
	
		
	static {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\CSPL-0088\\Java Projects\\maven\\library\\selenium\\chromedriver.exe");
	}
	WebDriver dr= new ChromeDriver();
	LoginPage lp= new LoginPage(dr);
	HomePage hp=new HomePage(dr);


	@BeforeTest
	public void beforeTest(){
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		dr.manage().window().maximize();
		dr.get("https://qa1.gststar.com/GSTStar");
	}


	@Test(priority=1)
	public void firstTest() throws InterruptedException {
		lp.Email.sendKeys("thulasiraju159@gmail.com");
		lp.Password.sendKeys("cspl@1234");
		Thread.sleep(10000);
		lp.LoginButton.click();
	}
	
	@Test(priority=2)
	public void logoutTest() {
		hp.LogoutButton.click();
		
	}

	@AfterTest
	public void tearDown(){
		dr.close();
	}


}
