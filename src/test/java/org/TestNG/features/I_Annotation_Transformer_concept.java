package org.TestNG.features;

import org.testng.Assert;
import org.testng.annotations.Test;

public class I_Annotation_Transformer_concept {
	public class Hard_Assertion {
		@Test(priority = -1)
		private void username() {
			String expected_us = "vignesh";
			String actual_us = "vignesh";
			Assert.assertEquals(actual_us, expected_us);

		}

		@Test
		private void password() {
			String expected_ps = "1234";
			String actual_ps = "2345";
			Assert.assertEquals(actual_ps, expected_ps);

		}

	}
	//create a xml 
}//go to transformer class
