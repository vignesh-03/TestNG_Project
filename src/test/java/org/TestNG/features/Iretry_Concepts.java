package org.TestNG.features;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Iretry_Concepts {

	@Test(priority = -1, retryAnalyzer = Retry_Class.class)
	private void username() {
		
		String a= "hello";
		String b = "hola";
		Assert.assertEquals(a, b);
		System.out.println("username");
	}

	@Test
	private void password() {
		String a= "hello";
		String b = "hola";
		Assert.assertNotEquals(a, b);
		System.out.println("password");
	}
}
