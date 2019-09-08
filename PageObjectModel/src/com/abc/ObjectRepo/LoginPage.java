package com.abc.ObjectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	By email=By.id("email");
	By password=By.id("pass");
	By login=By.id("send2");
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void enterEmail(String email1)
	{
		driver.findElement(email).sendKeys(email1);
	}
	
	public void enterPassword(String pass)
	{
		driver.findElement(password).sendKeys(pass);
	}
	
	public void clickOnLogin()
	{
		driver.findElement(login).click();
	}

}
