package com.bank.icici;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junit {
	@Before
	
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
        driver.get("https:\\www.facebook.com");
	}
	
	@Test
	public void ravi()
	{
		
	}
	
	@After
	public void kill()
	{
	driver.close();
	}
}