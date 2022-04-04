package org.pom_automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_page_automation {
	public WebDriver driver;

	@FindBy(xpath = "//a[@class='login']")
	private WebElement signin;

	@FindBy(id = "email")
	private WebElement emailid;

	@FindBy(id = "passwd")
	private WebElement password;

	@FindBy(id = "SubmitLogin")
	private WebElement signinbtn;
	
	
	public Home_page_automation(WebDriver driver2) {

		this.driver = driver2;

		PageFactory.initElements(driver, this);
	}

	public WebElement getSignin() {
		return signin;
	}

	public WebElement getEmailid() {
		return emailid;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSigninbtn() {
		return signinbtn;
	}
}
