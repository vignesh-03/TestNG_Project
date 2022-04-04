package org.TestNG.features;

import org.testng.annotations.Test;

public class Depadency_Test {

	@Test
	private void a() {
		System.out.println("A");
	}

	@Test
	private void b() {

		System.out.println("B");

	}

	@Test
	private void c() {

		System.out.println("C");
	}

	@Test
	private void d() {

		System.out.println("D");

	}

	@Test
	private void e() {

		System.out.println("E");

	}

}
