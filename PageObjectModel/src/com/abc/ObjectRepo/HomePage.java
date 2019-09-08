package com.abc.ObjectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	WebDriver driver;
	By logout=By.linkText("Log Out");
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void clickOnLogout()
	{
		driver.findElement(logout).click();
	}

}
