package com.testleaf.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.testleaf.base.ProjSpecificMethods;
import com.testleaf.pages.LoginPage;

public class TC001Login extends ProjSpecificMethods {

	@BeforeTest
	public void setData() {

		fileName = "TC001Login";

	}

	@Test(dataProvider = "getData")
	public void runLogin(String userName,String password) {
		// LoginPage myLogin=new LoginPage();
		// myLogin.enterUserName().enterPassword(); // as both the methods return the
		// same obj
		new LoginPage(driver).enterUserName(userName).enterPassword(password).clickLogin().clickLogout();

	}
}
