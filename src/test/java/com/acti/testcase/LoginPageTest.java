package com.acti.testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {

	

	@Test
	public void testLoginPageTitle() {

		String actual = lp.getActiTitle();
		String expected = "actiTIME - Login";
		Assert.assertEquals(actual, expected);
		quitDriver();
	}

	@Test
	public void testLoginPageImg() {

		boolean flag = lp.actiImageLogo();
		Assert.assertTrue(flag);
		quitDriver();

	}

	@Test
	public void testForgotPasswordLink() {

		boolean fplink = lp.ForgotPassword();
		Assert.assertTrue(fplink);
		quitDriver();

	}

	@Test
	public void testLoginFunction() {

		lp.username("admin");
		lp.password("manager");
		lp.clickLogin();

		String actualhpTitle = hp.getHomePageTitle();
		String expectedTtile = "actiTIME - Enter Time-Track";
		Assert.assertEquals(actualhpTitle, expectedTtile);
		quitDriver();

	}
}
