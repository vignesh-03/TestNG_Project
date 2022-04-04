package org.pom_automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dress_purchace_page {
	public WebDriver driver;

	@FindBy(xpath = "(//a[@title='Dresses'])[2]")
	private WebElement dress;
	@FindBy(xpath = "(//a[contains(@title,'You are looking for a dress for every day?')])[1]")
	private WebElement casualdress;
	@FindBy(xpath = "(//input[@type='checkbox'])[2]")
	private WebElement size;
	@FindBy(id = "selectProductSort")
	private WebElement list;
	@FindBy(xpath = "//img[@width='250']")
	private WebElement img;
//	frame
	@FindBy(xpath = "//iframe[@frameborder='0']")
	private WebElement toframeelement;
	@FindBy(name = "Submit")
	private WebElement framelelement;
//	
	@FindBy(name = "Submit")
	private WebElement addcart;
	@FindBy(xpath = "//a[@class='btn btn-default button button-medium']")
	private WebElement proceed;

	public Dress_purchace_page(WebDriver driver2) {
		this.driver = driver2;

		PageFactory.initElements(driver, this);
	}

	public WebElement getDress() {
		return dress;
	}

	public WebElement getCasualdress() {
		return casualdress;
	}

	public WebElement getSize() {
		return size;
	}

	public WebElement getList() {
		return list;
	}

	public WebElement getImg() {
		return img;
	}

	public WebElement getAddcart() {
		return addcart;
	}

	public WebElement getProceed() {
		return proceed;
	}

	public WebElement getToframeelement() {
		return toframeelement;
	}

	public WebElement getFramelelement() {
		return framelelement;
	}

}
