package org.TestNG.features;

import org.testng.annotations.Test;

public class Timeout_concept {
	
	@Test(timeOut = 14000)
	 private void Excecution() throws InterruptedException {

		
		Thread.sleep(5000);
		System.out.println("browser launch");
		Thread.sleep(3000);
		System.out.println("url launch");
		Thread.sleep(2000);
		System.out.println("email id");
		Thread.sleep(2000);
		System.out.println("password");
		Thread.sleep(1000);
		System.out.println("login button");
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
