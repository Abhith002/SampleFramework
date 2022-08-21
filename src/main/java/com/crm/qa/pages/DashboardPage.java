package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class DashboardPage extends TestBase{

	@FindBy(xpath = "//a[text()='Login']")
	WebElement login;
	
	@FindBy(xpath = "//a[text()='Sign Up']")
	WebElement signUp;
	
	public DashboardPage() {
		PageFactory.initElements(driver, this);
	}
	
	public LoginPage login() {
		login.click();
		return new LoginPage();
	}
	
	public SignUpPage signUp() {
		signUp.click();
		return new SignUpPage();
	}
}
