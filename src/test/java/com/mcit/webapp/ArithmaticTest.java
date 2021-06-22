package com.mcit.webapp;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

@DisplayName("Arithmatic calculator Test")
public class ArithmaticTest {
	
Calculator calc;
	
	@BeforeEach
	void setUp() {
		calc= new Calculator();
	}

	@AfterEach
	void cleanUp() {
		calc =null;
	}
	
	@Nested
	class AdditionTestGroup {
		
		@Test
		@DisplayName("Addition Test : positive number")
		void testAddittionPositive() {
			float actual = calc.add(100, 50);
			float expected = 150;
			Assertions.assertEquals(expected, actual);
		}
		
		@Test
		@DisplayName("Addition Test : negative number")
		void testAddittionNegative() {
			float actual = calc.add(-100, 50);
			float expected = -50;
			Assertions.assertEquals(expected, actual);
		}
		
		@Test
		@DisplayName("Addition Test : two negative number")
		void testAddittionTwoNegative() {
			Assertions.assertEquals(-150, calc.add(-100, -50));
		}
	}
	
	@Nested
	class SubstractionTestGroup {
		
		@Test
		@DisplayName("Substraction Test : two positive number")
		void testSubstractionTwoPositive() {
			Assertions.assertEquals(50, calc.sub(100, 50));
		}
		
		@Test
		@DisplayName("Substraction Test : one positive one negative number")
		void testSubstractionOnePositiveOneNegative() {
			Assertions.assertEquals(150, calc.sub(100, -50));
		}
		
		@Test
		@DisplayName("Substraction Test : two negative number")
		void testSubstractionTwoNegative() {
			Assertions.assertEquals(0, calc.sub(-100, -50));
		}
	}
	
	@Test
	@DisplayName("Outer test method")
	void testsample() {
		Assertions.assertTrue(true);
	}

}
