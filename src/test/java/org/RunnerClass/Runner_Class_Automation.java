package org.RunnerClass;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.BaseClass_Concept.Base_Class;
import org.apache.commons.io.FileUtils;
import org.configuration_helper.File_read_manager;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.pom_automation.Dress_purchace_page;
import org.pom_automation.Home_page_automation;
import org.pom_automation.Proceed_page;
import org.project_object_manager.Pom_Manager_Automation;
import org.testng.annotations.Test;

public class Runner_Class_Automation extends Base_Class {
	public static WebDriver driver = browser_config("chrome");

//	public static Home_page_automation hp = new Home_page_automation(driver);
//	public static Dress_purchace_page dp = new Dress_purchace_page(driver);
//	public static Proceed_page pp = new Proceed_page(driver);
	public static Pom_Manager_Automation pom1 = new Pom_Manager_Automation(driver);

	public static void main(String[] args) throws IOException, InterruptedException {

//	@Test
//	private void casualdresspurchase() throws IOException {

//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\admin\\eclipse-workspace\\Automation_project\\Driver\\chromedriver.exe");

//		WebDriver driver = new ChromeDriver();

//	    driver.get("http://automationpractice.com/index.php?id_category=8&controller=category");

//		geturl("http://automationpractice.com/index.php?id_category=8&controller=category");

		String url = File_read_manager.get_FRM().get_CR().get_url();
		geturl(url);

//      driver.manage().window().maximize();

//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		implicitwait();

//		 WebElement login = driver.findElement(By.xpath("//a[@class='login']"));

//		login.click();
//		clickmethod(hp.getSignin());
		clickmethod(pom1.getHp().getSignin());

//		WebElement email = driver.findElement(By.id("email"));
//		email.sendKeys("iamvignesh03@gmail.com");
//		senddata(hp.getEmailid(), "iamvignesh03@gmail.com");
//		senddata(pom1.getHp().getEmailid(), "iamvignesh03@gmail.com");

		String email = File_read_manager.get_FRM().get_CR().get_email();
		senddata(pom1.getHp().getEmailid(), email);

//		WebElement password = driver.findElement(By.id("passwd"));
//		password.sendKeys("vignesh");
//		senddata(hp.getPassword(), "vignesh");
//		senddata(pom1.getHp().getPassword(), "vignesh");

		String password = File_read_manager.get_FRM().get_CR().get_password();
		senddata(pom1.getHp().getPassword(), password);

//		WebElement button = driver.findElement(By.id("SubmitLogin"));
//		button.click();
//		clickmethod(hp.getSigninbtn());
		clickmethod(pom1.getHp().getSigninbtn());

//		WebElement dress = driver.findElement(By.xpath("(//a[@title='Dresses'])[2]"));
//		dress.click();
//		clickmethod(dp.getDress());
		clickmethod(pom1.getDp().getDress());

//		WebElement casualdress = driver
//				.findElement(By.xpath("(//a[contains(@title,'You are looking for a dress for every day?')])[1]"));
//		casualdress.click();
//		clickmethod(dp.getCasualdress());
		clickmethod(pom1.getDp().getCasualdress());

//		WebElement size = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
//		size.click();
//		clickmethod(dp.getSize());
		clickmethod(pom1.getDp().getSize());

//		WebElement list = driver.findElement(By.id("selectProductSort"));

//		Select s = new Select(list);
//		s.selectByValue("price:desc");
//		dropdown("value", dp.getList(), "price:desc");
		dropdown("value", pom1.getDp().getList(), "price:desc");

//		WebElement img = driver.findElement(By.xpath("//img[@width='250']"));
//		img.click();
//		clickmethod(dp.getImg());
		clickmethod(pom1.getDp().getImg());

//		WebElement frm = driver.findElement(By.xpath("//iframe[@frameborder='0']"));
//		driver.switchTo().frame(frm);
//		frame(frm);
		frame(pom1.getDp().getToframeelement());

//		WebElement frameelement = driver.findElement(By.name("Submit"));
//		frameelement.click();
//		clickmethod(frameelement);
		clickmethod(pom1.getDp().getFramelelement());

//		driver.switchTo().defaultContent();
		defaultframe();

		/*
		 * WebElement addcart = driver.findElement(By.name("Submit")); addcart.click();
		 * clickmethod(addcart); clickmethod(dp.getAddcart());
		 */

//		clickmethod(pom1.getDp().getAddcart());

//		WebElement proceed = driver.findElement(By.xpath("//a[@class='btn btn-default button button-medium']"));
//		proceed.click();
//		clickmethod(dp.getProceed());
		clickmethod(pom1.getDp().getProceed());

//		WebElement proceesd1 = driver
//			.findElement(By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']"));
//		proceesd1.click();
//		clickmethod(proceesd1);
//		clickmethod(pp.getPrcd1());
		clickmethod(pom1.getPp().getPrcd1());

//		WebElement proceesd2 = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
//		proceesd2.click();
//		clickmethod(proceesd2);
//		clickmethod(pp.getPrcd2());
		clickmethod(pom1.getPp().getPrcd2());

//		WebElement agree = driver.findElement(By.id("cgv"));
//		agree.click();
//		clickmethod(agree);
//		clickmethod(pp.getAgree());
		clickmethod(pom1.getPp().getAgree());

//		WebElement proceesd3 = driver.findElement(By.name("processCarrier"));
//		proceesd3.click();
//		clickmethod(proceesd3);
//		clickmethod(pp.getPrcd3());
		clickmethod(pom1.getPp().getPrcd3());

//		WebElement payment = driver.findElement(By.xpath("//a[@class='bankwire']"));
//		payment.click();
//		clickmethod(payment);
//		clickmethod(pp.getPayment());
		clickmethod(pom1.getPp().getPayment());

//		WebElement confirmorder = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
//		confirmorder.click();
//		clickmethod(confirmorder);
//		clickmethod(pp.getConfirm());
		clickmethod(pom1.getPp().getConfirm());

//		TakesScreenshot ts = (TakesScreenshot) driver;
//
//		File location = ts.getScreenshotAs(OutputType.FILE);
//
//		File dest = new File("C:\\Users\\admin\\eclipse-workspace\\Automation_project\\Screenshots\\hi.png");
//
//		FileUtils.copyFile(location, dest);
//		
//		screenshot("automation women");

//		Thread.sleep(10000);

//		WebElement logout = driver.findElement(By.xpath("(//a[@rel=\"nofollow\"])[2]"));

//		clickmethod(logout);
//		clickmethod(pp.getLogout());
		clickmethod(pom1.getPp().getLogout());
	}
}

//		driver.close();

	/*
	@Test
	private void summerdresspurchase() throws IOException {

//	System.setProperty("webdriver.chrome.driver",
//			"C:\\Users\\admin\\eclipse-workspace\\Automation_project\\Driver\\chromedriver.exe");

//	WebDriver driver = new ChromeDriver();

//    driver.get("http://automationpractice.com/index.php?id_category=8&controller=category");

//	geturl("http://automationpractice.com/index.php?id_category=8&controller=category");

		String url = File_read_manager.get_FRM().get_CR().get_url();
		geturl(url);

//  driver.manage().window().maximize();

//	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		implicitwait();

//	 WebElement login = driver.findElement(By.xpath("//a[@class='login']"));

//	login.click();
//	clickmethod(hp.getSignin());
		clickmethod(pom1.getHp().getSignin());

//	WebElement email = driver.findElement(By.id("email"));
//	email.sendKeys("iamvignesh03@gmail.com");
//	senddata(hp.getEmailid(), "iamvignesh03@gmail.com");
//	senddata(pom1.getHp().getEmailid(), "iamvignesh03@gmail.com");

		String email = File_read_manager.get_FRM().get_CR().get_email();
		senddata(pom1.getHp().getEmailid(), email);

//	WebElement password = driver.findElement(By.id("passwd"));
//	password.sendKeys("vignesh");
//	senddata(hp.getPassword(), "vignesh");
//	senddata(pom1.getHp().getPassword(), "vignesh");

		String password = File_read_manager.get_FRM().get_CR().get_password();
		senddata(pom1.getHp().getPassword(), password);

//	WebElement button = driver.findElement(By.id("SubmitLogin"));
//	button.click();
//	clickmethod(hp.getSigninbtn());
		clickmethod(pom1.getHp().getSigninbtn());

//	WebElement dress = driver.findElement(By.xpath("(//a[@title='Dresses'])[2]"));
//	dress.click();
//	clickmethod(dp.getDress());
		clickmethod(pom1.getDp().getDress());

//	WebElement casualdress = driver
//			.findElement(By.xpath("(//a[contains(@title,'Short dress, long dress, silk dress, printed dress, you will find the perfect dress for summer.')])[1]"));
//	casualdress.click();
//	clickmethod(dp.getCasualdress());
		clickmethod(pom1.getDp().getCasualdress());

//	WebElement size = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
//	size.click();
//	clickmethod(dp.getSize());
		clickmethod(pom1.getDp().getSize());

//	WebElement list = driver.findElement(By.id("selectProductSort"));

//	Select s = new Select(list);
//	s.selectByValue("price:desc");
//	dropdown("value", dp.getList(), "price:desc");
		dropdown("value", pom1.getDp().getList(), "price:desc");

//	WebElement img = driver.findElement(By.xpath("//img[@width='250']"));
//	img.click();
//	clickmethod(dp.getImg());
		clickmethod(pom1.getDp().getImg());

//		
//		  WebElement frm = driver.findElement(By.xpath("//iframe[@frameborder='0']"));
//		 driver.switchTo().frame(frm); WebElement frameelement =
//		 driver.findElement(By.name("Submit")); frameelement.click();
//		  driver.switchTo().defaultContent();
		 

//		WebElement frm = driver.findElement(By.xpath("//iframe[@frameborder='0']"));
//		driver.switchTo().frame(frm);
//		frame(frm);
		frame(pom1.getDp().getToframeelement());

//		WebElement frameelement = driver.findElement(By.name("Submit"));
//		frameelement.click();
//		clickmethod(frameelement);
		clickmethod(pom1.getDp().getFramelelement());

//		driver.switchTo().defaultContent();
		defaultframe();

//	WebElement addcart = driver.findElement(By.name("Submit"));
//	addcart.click();
//	clickmethod(addcart);
//	clickmethod(dp.getAddcart());

//	clickmethod(pom1.getDp().getAddcart());

//	WebElement proceed = driver.findElement(By.xpath("//a[@class='btn btn-default button button-medium']"));
//	proceed.click();
//	clickmethod(dp.getProceed());
		clickmethod(pom1.getDp().getProceed());

//	WebElement proceesd1 = driver
//		.findElement(By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']"));
//	proceesd1.click();
//	clickmethod(proceesd1);
//	clickmethod(pp.getPrcd1());
		clickmethod(pom1.getPp().getPrcd1());

//	WebElement proceesd2 = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
//	proceesd2.click();
//	clickmethod(proceesd2);
//	clickmethod(pp.getPrcd2());
		clickmethod(pom1.getPp().getPrcd2());

//	WebElement agree = driver.findElement(By.id("cgv"));
//	agree.click();
//	clickmethod(agree);
//	clickmethod(pp.getAgree());
		clickmethod(pom1.getPp().getAgree());

//	WebElement proceesd3 = driver.findElement(By.name("processCarrier"));
//	proceesd3.click();
//	clickmethod(proceesd3);
//	clickmethod(pp.getPrcd3());
		clickmethod(pom1.getPp().getPrcd3());

//	WebElement payment = driver.findElement(By.xpath("//a[@class='bankwire']"));
//	payment.click();
//	clickmethod(payment);
//	clickmethod(pp.getPayment());
		clickmethod(pom1.getPp().getPayment());

//	WebElement confirmorder = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
//	confirmorder.click();
//	clickmethod(confirmorder);
//	clickmethod(pp.getConfirm());
		clickmethod(pom1.getPp().getConfirm());

//	TakesScreenshot ts = (TakesScreenshot) driver;
//
//	File location = ts.getScreenshotAs(OutputType.FILE);
//
//	File dest = new File("C:\\Users\\admin\\eclipse-workspace\\Automation_project\\Screenshots\\hi.png");
//
//	FileUtils.copyFile(location, dest);
//	
//	screenshot("automation women");

//	Thread.sleep(10000);

//	WebElement logout = driver.findElement(By.xpath("(//a[@rel=\"nofollow\"])[2]"));

//	clickmethod(logout);
//	clickmethod(pp.getLogout());
		clickmethod(pom1.getPp().getLogout());
	}

}
*/

//}
