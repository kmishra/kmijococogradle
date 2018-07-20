package com.sm.jacoco.gradle.example;


import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class JacocoGradleValidateTest {
	
	private JacocoGradleValidate jacocoGradleValidateObj;

	@Before
	public void setup() {
		jacocoGradleValidateObj = new JacocoGradleValidate();
	}
	
	@Test
	public void testGetValidationMessageForTesting() {
		assertEquals("The message is for testing!", jacocoGradleValidateObj.getValidationMessage(true));
	}
	
	@Test
	public void testGetValidationMessageForNotTesting() {
		assertEquals("The message is NOT for testing!", jacocoGradleValidateObj.getValidationMessage(false));
	}

}
