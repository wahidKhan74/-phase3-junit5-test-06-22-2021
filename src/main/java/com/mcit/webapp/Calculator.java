package com.mcit.webapp;


public class Calculator {
	
	
	// addition operation
	public float add(float num1, float num2) {
		return num1 + num2;
	}

	// Subtraction operations
	public float sub(float num1, float num2) {
		if(num1 > num2 ) {
			return num1 - num2;
		}
		return 0;
	}
	
	// TTD : Test driven development :-> test first then -> logic
	//TODO : WAUT : mul , div, avg etc.
}
    
