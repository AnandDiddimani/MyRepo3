package com.abc.MagentoTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.abc.ObjectRepo.HomePage;
import com.abc.ObjectRepo.LoginPage;
import com.abc.ObjectRepo.Welcome;

public class MagentoTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.magento.com");
		
		Welcome w = new Welcome(driver);
		w.clickOnMyAccount();
		
		LoginPage l = new LoginPage(driver);
		l.enterEmail("nikhildandge.abc@gmail.com");
		l.enterPassword("Welcome123");
		l.clickOnLogin();
		
		HomePage h = new HomePage(driver);
		h.clickOnLogout();
		
		driver.quit();
	}

}
