package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase{

	//PageFactory or Object Repository
	@FindBy(xpath = "//input[@name='email']")
	WebElement username;
	
	@FindBy(xpath = "//input[@name='password']")
	WebElement password;
	
	@FindBy(xpath = "//div[text()='Login']")
	WebElement loginBtn;
	
	@FindBy(xpath = "//a[text()='Sign Up']")
	WebElement signUp;
	
	//Initializing the Page Objects
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions:
	
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	public HomePage login(String usr, String pwd) {
		username.sendKeys(usr);
		password.sendKeys(pwd);
		loginBtn.click();
		
		return new HomePage();
	}
	
}
