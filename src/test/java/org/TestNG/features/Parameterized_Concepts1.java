package org.TestNG.features;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterized_Concepts1 {

	@Test
	@Parameters({ "username", "password" })
	private void credentaials(String username, String password) {

		System.out.println("username:" + username);

		System.out.println("password:" + password);

	}
}
