package com.mcit.webapp;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Standar Annotation For Junit 5 Tests")
public class StandardJunitTest {
	
	@BeforeAll
	static void setUpAll() {
		System.out.println(" Before All Method");
	}
	
	@AfterAll
	static void tearDownAll() {
		System.out.println(" After All Method");
	}
	
	@BeforeEach
	void setUp() {
		System.out.println(" Before Each Method");
	}
	
	@AfterEach
	void tearDown() {
		System.out.println(" After Each Method");
	}

	@Test
	@DisplayName("Test One")
	void testOne() {
		System.out.println("-- Test 1 is executed ---");
	}
	
	@Test
	@DisplayName("Test Two")
	void testTwo() {
		System.out.println("-- Test 2 is executed ---");
	}
	
	@Test
	@Disabled
	void testThree() {
		System.out.println("-- Test 3 is executed ---");
	}
}
