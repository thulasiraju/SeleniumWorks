package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SynchTest {

	@Test
	public void firstTest() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\CSPL-0088\\Java Projects\\maven\\library\\selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.cricbuzz.com");
		driver.findElement(By.xpath("//a[.='Schedule']"));
	}
	
	
}
