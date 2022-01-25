package com.LBG.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.LBG.base.TestBaseClass;

public class LoginPage extends TestBaseClass{
	
//pagefactory / Object Repository
	
	@FindBy(id="txtUsername")
	WebElement username;
	
	@FindBy(id="txtPassword")
	WebElement password;
	
	@FindBy(id="btnLogin")
	WebElement loginbutton;
	
	@FindBy(id="forgotPasswordLink")
	WebElement link;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	
	public void login(String un, String pwd)
	{
		username.sendKeys(un);
		password.sendKeys(pwd);
		//return new DashBoardPage();
	}
	
	public void clickLogin()
	{
		
		loginbutton.click();
		//return new DashBoardPage();
	}
}

