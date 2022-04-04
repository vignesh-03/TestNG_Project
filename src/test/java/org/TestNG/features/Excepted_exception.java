package org.TestNG.features;

import org.testng.annotations.Test;

public class Excepted_exception {

	@Test(expectedExceptions = ArithmeticException.class)
	private void calci() {
		int a = 10;
		System.out.println(a / 0);
		System.out.println("cant devide by 0");
	}

}
