package com.testleaf.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.testleaf.base.ProjSpecificMethods;

public class MyHomePage extends ProjSpecificMethods {

	public MyHomePage(RemoteWebDriver driver) {
		this.driver = driver;
	}
	public LeadsPage clickLeads() {

		return new LeadsPage();
	}

}
