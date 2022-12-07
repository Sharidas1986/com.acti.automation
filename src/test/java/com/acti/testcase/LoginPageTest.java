package com.acti.testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import come.acti.base.DriverManager;
import come.acti.page.HomePage;
import come.acti.page.LoginPage;

public class LoginPageTest extends DriverManager {
	

	@Test
	public void testLoginPageTitle() {
		initApplication();
		LoginPage lp = new LoginPage();
		String actual = lp.getActiTitle();
		String expected = "actiTIME - Login";
		Assert.assertEquals(actual, expected);
		quitDriver();
	}

	@Test
	public void testLoginPageImg() {
		initApplication();
		LoginPage lp = new LoginPage();
		boolean flag = lp.actiImageLogo();
		Assert.assertTrue(flag);
		quitDriver();

	}
	
	
	@Test
	public void testForgotPasswordLink()
	{
		initApplication();
		LoginPage lp = new LoginPage();
		boolean fplink = lp.ForgotPassword();
		Assert.assertTrue(fplink);
		lp.quitDriver();
		
	}
	
	@Test
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
