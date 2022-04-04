package org.TestNG.features;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignore_Features {
	
	/*
	 3ways
	 - @ignore
	 -@Test(enabled = false)// default value of enabled is true
	 -<exclude name = "methode name">//in xml file
	 */
	
	
	@Test
	private void whatsapp() {
System.out.println("whatsapp");
	}

	@Ignore
	private void insta() {
System.out.println("insta");
	}
	@Test(enabled = false)
	private void twitr() {
System.out.println("tweet");
	}
	@Test(priority = -1)
	private void books() {
System.out.println("java");
	}
	@Test(priority = 1)
	private void youtube() {
System.out.println("sharemrket");
	}
	
	
	
	
	
	

}
