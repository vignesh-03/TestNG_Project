package org.pom_automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Proceed_page {
	public WebDriver driver;

	@FindBy(xpath = "//a[@class='button btn btn-default standard-checkout button-medium']")
	private WebElement prcd1;
	@FindBy(xpath = "(//button[@type='submit'])[2]")
	private WebElement prcd2;
	@FindBy(id = "cgv")
	private WebElement agree;
	@FindBy(name = "processCarrier")
	private WebElement prcd3;
	@FindBy(xpath = "//a[@class='bankwire']")
	private WebElement payment;
	@FindBy(xpath = "(//button[@type='submit'])[2]")
	private WebElement confirm;
	@FindBy(xpath = "(//a[@rel=\"nofollow\"])[2]")
	private WebElement logout;

	
	public Proceed_page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);

	}

	/**
	 * @return the prcd1
	 */
	public WebElement getPrcd1() {
		return prcd1;
	}

	/**
	 * @return the prcd2
	 */
	public WebElement getPrcd2() {
		return prcd2;
	}

	/**
	 * @return the agree
	 */
	public WebElement getAgree() {
		return agree;
	}

	/**
	 * @return the prcd3
	 */
	public WebElement getPrcd3() {
		return prcd3;
	}

	/**
	 * @return the payment
	 */
	public WebElement getPayment() {
		return payment;
	}

	/**
	 * @return the confirm
	 */
	public WebElement getConfirm() {
		return confirm;
	}

	public WebElement getLogout() {
		return logout;
	}

}
