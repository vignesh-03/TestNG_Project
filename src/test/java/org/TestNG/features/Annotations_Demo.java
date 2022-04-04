package org.TestNG.features;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations_Demo {

	@BeforeSuite
	private void openchrome() {
		System.out.println("A");
	}

	@BeforeClass
	private void a() {
		System.out.println("C");
	}

	@BeforeTest
	private void putdata() {
		System.out.println("B");
	}

	@BeforeMethod
	private void signin() {
		System.out.println("#");
	}

	@Test
	private void login() {

		System.out.println("d");
	}

	@Test

	private void logout() {
		System.out.println("e");
	}

	@AfterMethod
	private void signout() {
		System.out.println("$");
	}

	@AfterTest
	private void get() {
		System.out.println("g");
	}

	@AfterClass

	private void browserclose() {
		System.out.println("f");
	}

	@AfterSuite
	private void quite() {
		System.out.println("close all");
	}
}
