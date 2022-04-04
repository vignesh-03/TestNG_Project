package org.project_object_manager;

import org.openqa.selenium.WebDriver;
import org.pom_automation.Dress_purchace_page;
import org.pom_automation.Home_page_automation;
import org.pom_automation.Proceed_page;

public class Pom_Manager_Automation {

	public WebDriver driver;

	private Dress_purchace_page dp;
	private Home_page_automation hp;
	private Proceed_page pp;

	public Pom_Manager_Automation(WebDriver driver2) {

		this.driver = driver2;

	}
	

	public Dress_purchace_page getDp() {
		
		if (dp==null) {
			dp=new Dress_purchace_page(driver);
		}
		return dp;
	}

	public Home_page_automation getHp() {
		
		if(hp==null) {
			hp= new Home_page_automation(driver);
		}
		return hp;
	}

	public Proceed_page getPp() {
		if(pp== null) {
			pp= new Proceed_page(driver);
			
		}
		
		return pp;
	}

}
