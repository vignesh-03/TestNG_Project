package org.TestNG.features;

import org.testng.annotations.Test;

public class Group_Concept {
	// @Test(groups="")

	@Test(priority = -5,groups = "socialmedia")
	private void whatsapp() {
		System.out.println("chat");
	}

	@Test(priority = -5,groups = "socialmedia")
	private void insta() {
		System.out.println("posts");
	}

	@Test(priority = -1,groups = "knowledge")
	private void books() {
		System.out.println("java");
	}

	@Test(priority = -1,groups = "knowledge")
	private void internet() {
		System.out.println("wikipedia");
	}

	@Test(groups = "cricket")
	private void csk() {
		System.out.println("csk");

	}

	@Test(groups = "cricket")
	private void rcb() {
		System.out.println("rcb");
	}

}
