package org.TestNG.features;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assertion {
	@Test
	private void username() {
		String expected_name = "vignesh";
		String actual_name= "hsengiv";
		SoftAssert s= new SoftAssert();
		s.assertEquals(actual_name, actual_name);
		
		System.out.println("perfect one");

	}
}
