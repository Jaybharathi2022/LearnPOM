package com.testleaf.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.testleaf.base.ProjSpecificMethods;

public class LoginPage extends ProjSpecificMethods {

	public LoginPage(RemoteWebDriver driver) {
		this.driver=driver; //this.driver --> from base class
		
	}
	public LoginPage enterUserName(String uName) {
		// enter username
		driver.findElement(By.id("username")).sendKeys(uName);
		return this; // new LoginPage();- same class
	}

	public LoginPage enterPassword(String pwd) {
		// enter password
		driver.findElement(By.id("password")).sendKeys(pwd);
		return this;
	}

	public HomePage clickLogin() {

		// click login
		driver.findElement(By.className("decorativeSubmit")).click();
		return new HomePage(driver);
	}

}