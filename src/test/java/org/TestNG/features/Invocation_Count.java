package org.TestNG.features;

import org.testng.annotations.Test;

public class Invocation_Count {

	@Test(priority = -1)
	private void openbrowser() {
		System.out.println("launch browser");

	}

	@Test
	private void launchurl() {
		System.out.println("url launched");
	}

	@Test(invocationCount = 5)
	private void refresh() {
		System.out.println("refresh");
	}

}
