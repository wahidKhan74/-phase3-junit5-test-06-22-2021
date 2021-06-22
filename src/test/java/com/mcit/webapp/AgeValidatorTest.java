package com.mcit.webapp;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Age Validator Test")
public class AgeValidatorTest {

	AgeValidator av;
	
	@BeforeEach
	void setUp() {
		av = new AgeValidator();
	}

	@AfterEach
	void cleanUp() {
		av =null;
	}
	
	
	@Test
	@DisplayName("Age Test : positive number lower then 18")
	void testPositiveLowerAge() {
		Assertions.assertEquals(false, av.validate(10));
	}
	
	@Test
	@DisplayName("Age Test : positive number higher then 18 ")
	void testPositiveHigherAge() {
		Assertions.assertEquals(true, av.validate(30));
	}
	
	@Test
	@DisplayName("Age Test : nagative number higher then 18 ")
	void testNegativeHigherAge() {
		Assertions.assertEquals(false, av.validate(-30));
	}
}
