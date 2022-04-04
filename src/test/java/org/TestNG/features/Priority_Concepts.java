package org.TestNG.features;

import org.testng.annotations.Test;

public class Priority_Concepts {

	/*
	 * we can customize our excecution order by use of
	 * 
	 * @Test(priority = value) order= -n,...-3,-2,-1,0,1,2,3,...n
	 if we not give a priority in @test it will consider as a 0
	 if priority no is sam the priority depends on ascci value order
	 */

	@Test(priority = -1) // -ve value used to run before 0 and +ve
	private void Username() {

		System.out.println("hi");
	}

	@Test(priority = +1)
	private void login() {
		System.out.println("logged in");
	}

	@Test // priority is zero(default)

	private void password() {
		System.out.println("hello");
	}
}
