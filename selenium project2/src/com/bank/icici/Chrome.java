package com.bank.icici;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Chrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "C:\\users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
            ChromeDriver driver=new ChromeDriver();
            driver.get("https:\\www.facebook.com");
            
            driver.quit();
            
            System.setProperty("webdriver.gecko.driver", "C:\\Users\\hp\\Downloads\\geckodriver-v0.18.0-win64\\geckodriver.exe");
            FirefoxDriver fd=new FirefoxDriver();
            fd.get("https:\\www.youtube.com");
            fd.quit();
            
            
            System.setProperty("webdriver.ie.driver", "C:\\Users\\hp\\Downloads\\IEDriverServer_Win32_2.53.1\\IEDriverServer.exe");
	         InternetExplorerDriver ied=new InternetExplorerDriver();
	         ied.get("http://www.gmail.com");
	         ied.quit();
	}
	
	

}
