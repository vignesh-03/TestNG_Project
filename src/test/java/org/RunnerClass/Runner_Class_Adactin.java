package org.RunnerClass;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.BaseClass_Concept.Base_Class;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.configuration_helper.Configuration_Reader;
import org.configuration_helper.File_read_manager;
import org.logger_concepts.Property_Configs;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.pom_adactin.Booking_Page;
import org.pom_adactin.Home_Page;
import org.pom_adactin.Radiobtn_Page;
import org.pom_adactin.Searchhotel_Page;
import org.project_object_manager.Pom_Manager_Adactin;

public class Runner_Class_Adactin extends Base_Class {

	public static WebDriver driver = browser_config("chrome");
	

//	public static Home_Page hp = new Home_Page(driver);
//
//	public static Searchhotel_Page sp = new Searchhotel_Page(driver);
//
//	public static Radiobtn_Page rd = new Radiobtn_Page(driver);

	
//	public static Booking_Page bp = new Booking_Page(driver);

	public static Pom_Manager_Adactin pom = new Pom_Manager_Adactin(driver);

	public static Logger log = Logger.getLogger(Runner_Class_Adactin.class);

	public static void main(String[] args) throws Throwable {

		PropertyConfigurator.configure("log4j.properties");

//		String url = File_read_manager.get_FRM().get_CR().get_url();
		
		geturl("https://adactinhotelapp.com/");
		
		log.info("launch url");

		implicitwait();

		senddata(pom.getHp().getUserName(), particular_data_Adactin(2, 5));

		senddata(pom.getHp().getPassword(), particular_data_Adactin(3, 5));

		clickmethod(pom.getHp().getLoginbtn());

		Thread.sleep(3000);

		dropdown("byvalue", pom.getSp().getLocation(), particular_data_Adactin(5, 5));

		dropdown("bytext", pom.getSp().getHotel(), particular_data_Adactin(6, 5));

		dropdown("byvalue", pom.getSp().getRoomType(), particular_data_Adactin(7, 5));

		dropdown("byvalue", pom.getSp().getRoomNos(), particular_data_Adactin(8, 5));

		senddata(pom.getSp().getCkin(), particular_data_Adactin(9, 5));

		senddata(pom.getSp().getCkout(), particular_data_Adactin(10, 5));

		dropdown("byvalue", pom.getSp().getAdultRoom(), particular_data_Adactin(11, 5));

		dropdown("byindex", pom.getSp().getChildrenRoom(), particular_data_Adactin(12, 5));

		clickmethod(pom.getSp().getSubmitBtn());

		clickmethod(pom.getRb().getRadioBtn());

		clickmethod(pom.getRb().getContinue_Btn());

		senddata(pom.getBp().getfName(), particular_data_Adactin(17, 5));

		senddata(pom.getBp().getlName(), particular_data_Adactin(18, 5));

		senddata(pom.getBp().getAddress(), particular_data_Adactin(19, 5));

		senddata(pom.getBp().getCcn(), "1234567812345678");

		dropdown("byvalue", pom.getBp().getCardType(), particular_data_Adactin(21, 5));

		dropdown("byvalue", pom.getBp().getExpiryMonth(), particular_data_Adactin(22, 5));

		dropdown("byvalue", pom.getBp().getExpiryYear(), particular_data_Adactin(23, 5));

		senddata(pom.getBp().getCcvNo(), particular_data_Adactin(24, 5));

		clickmethod(pom.getBp().getBooknowbtn());

		Thread.sleep(10000);

		screenshot("adactin POM");

		Thread.sleep(20000);

		clickmethod(pom.getBp().getLogoutBtn());

		log.info("logout");

		close();
	}

}
