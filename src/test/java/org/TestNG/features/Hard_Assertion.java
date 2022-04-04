package org.TestNG.features;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Hard_Assertion {
	@Test
	private void username() {
		String expected_person = "vignesh";
		String actual_person = "hsengiv";
		Assert.assertEquals(actual_person, expected_person);
		System.out.println("perfect one");

	}

	@Test
	private void pm() {
		String expected_person = "modi";
		String actual_person = "modi";
		Assert.assertEquals(actual_person, expected_person);
		System.out.println("perfect one");

	}

}