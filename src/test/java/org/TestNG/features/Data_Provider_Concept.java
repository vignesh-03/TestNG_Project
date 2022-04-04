package org.TestNG.features;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider_Concept {

	@Test(dataProvider = "test_data")
	private void adactin(String username, int password) {

		System.out.println("username " + username);
		System.out.println("password " + password);

	}
	@Test(dataProvider = "test_data")
	private void automation(String username, int password) {

		System.out.println("username " + username);
		System.out.println("password " + password);

	}

	
	@DataProvider
	private Object[][] test_data() {

		return new Object[][] { { "vignesh", 12345 }, 

		};

	}

}
