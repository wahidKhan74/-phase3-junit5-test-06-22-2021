package com.mcit.webapp;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class AssertionTests {
	
	String firstName="John";
	String lastName;
	int age = 35;
	String[] members = {"Mike","David","Jon"};
	String[] groups = {"Mike","David","Jon"};
	String[] people = {"Mike","David"};
	
	@Test
	void testAssertionsEqual() {
		Assertions.assertEquals(firstName, "John");
		// Assertions.assertEquals(firstName, "Johny"); // fail
		Assertions.assertEquals(age, 35);
	}
	
	@Test
	void testAssertionsTrue() {		
		Assertions.assertTrue(true);  // passed
		Assertions.assertTrue(100>50);
		Assertions.assertTrue(age>10);
	}
	
	@Test
	void testAssertionsFalse() {		
		Assertions.assertFalse(false);  // passed
		Assertions.assertFalse(100>150);
		Assertions.assertFalse(age>50);
	}
	
	
	@Test
	void testAssertionsNullandNotNull() {		
		Assertions.assertNull(null);  //passed
		Assertions.assertNull(lastName);
	
		Assertions.assertNotNull(firstName);
		Assertions.assertNotNull("Mike");
	}
	
	@Test
	void testAssertionsForArrays() {
		Assertions.assertArrayEquals(members, groups);
		// Assertions.assertArrayEquals(members, people);// faile		
	}
}
