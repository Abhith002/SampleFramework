package com.crm.qa.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.DashboardPage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.SignUpPage;

public class DashboardPageTest extends TestBase{
	
	DashboardPage dashboardPage;
	LoginPage loginPage;
	SignUpPage signUpPage; 
	
	public DashboardPageTest() {
		super();
	}
	
	@BeforeMethod
	public void SetUp() {
		initialization();
		dashboardPage = new DashboardPage();
	}
	
	@Test
	public void loginTest() {
		loginPage = dashboardPage.login();
	}
	
	@Test
	public void signUpTest() {
		signUpPage = dashboardPage.signUp();
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
