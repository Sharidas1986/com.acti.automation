package com.acti.testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import come.acti.base.DriverManager;
import come.acti.page.HomePage;
import come.acti.page.LoginPage;

public class LoginPageTest extends DriverManager {
	

	@Test(priority = 1)
	public void testLoginPageTitle() {
		initApplication();
		LoginPage lp = new LoginPage();
		String actual = lp.getActiTitle();
		String expected = "actiTIME - Login";
		Assert.assertEquals(actual, expected);
		quitDriver();
	}

	@Test(priority = 2)
	public void testLoginPageImg() {
		initApplication();
		LoginPage lp = new LoginPage();
		boolean flag = lp.actiImageLogo();
		Assert.assertTrue(flag);
		quitDriver();

	}
	
	
	@Test(priority = 3)
	public void testForgotPasswordLink()
	{
		initApplication();
		LoginPage lp = new LoginPage();
		boolean fplink = lp.ForgotPassword();
		Assert.assertTrue(fplink);
		lp.quitDriver();
		
	}
	
	@Test(priority = 4)
	public void testLoginFunction()
	{
		initApplication();
		LoginPage lp = new LoginPage();
		lp.username("admin");
		lp.password("manager");
		lp.clickLogin();
		HomePage hp = new HomePage();
		String actualhpTitle = hp.getHomePageTitle();
		String expectedTtile = "actiTIME - Enter Time-Track";
		Assert.assertEquals(actualhpTitle, expectedTtile);
		quitDriver();
		
	}
}
