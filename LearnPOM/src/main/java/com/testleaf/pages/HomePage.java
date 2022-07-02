package com.testleaf.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.testleaf.base.ProjSpecificMethods;

public class HomePage extends ProjSpecificMethods {

	public HomePage(RemoteWebDriver driver) {
		this.driver = driver;
	}

	public MyHomePage clickCRMSFALink() {
		return new MyHomePage(driver);
	}

	public LoginPage clickLogout() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new LoginPage(driver);
	}

	public HomePage verifyLoginSuccess() {
		return this;
	}

}
