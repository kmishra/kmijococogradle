package com.sm.jacoco.gradle.example;

public class JacocoGradleValidate {
	
	public String getValidationMessage(boolean isMessageForTesting) {
		if (isMessageForTesting) {
			return "The message is for testing!";
		} else {
			return "The message is NOT for testing!";
		}
	}

}
