package org.TestNG.features;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterized_Concepts2 {
	@Test
	@Parameters({ "username", "password" })
	private void credentaials( String username,@Optional("NAMO123") String password) {

		System.out.println("username:" + username);

		System.out.println("password:" + password);

	}

}
