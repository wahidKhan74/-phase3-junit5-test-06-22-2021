package com.mcit.webapp;

public class AgeValidator {
	
	public boolean validate(int age) {
		if(age>18) {
			System.out.println("valid age");
			return true;
		}
		return false;
	}
}
