package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.bases.TestBase;

public class LoginPage extends TestBase {
	
	//page Factory
	
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//input[contains(@class,'btn btn-small')]")
	WebElement submit_button;
	
	@FindBy(xpath="//font[contains(test(),'Sign Up']")
	WebElement sign_up;
	
	@FindBy(xpath="//img[contains[@class,'img-responsive')]")
	WebElement CRM_Logo;
	
	public LoginPage(){
		PageFactory.initElements(driver,this);
	}
	
	public String validateLoginPageTitle()
	{
		return driver.getTitle();
	}
	public boolean validateCRMimage()
	{
		return CRM_Logo.isDisplayed();
	}
	public HomePage login(String un,String pass)
	{
		username.sendKeys(un);
		password.sendKeys(pass);
		submit_button.click();
		
		return new HomePage();
	}
	

}
