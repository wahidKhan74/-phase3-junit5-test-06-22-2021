package com.mcit.webapp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIf;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

public class CondtitonalTest {
	
	@Test
	@DisplayName("Test Run on Windows Operating System")
	@EnabledOnOs({OS.WINDOWS})
	void testRunOnWindows() {
		System.out.println("This test run only on windows platform");
		Assertions.assertTrue(true);
	}
	
	@Test
	@DisplayName("Test Run on Linux Operating System")
	@EnabledOnOs({OS.LINUX})
	void testRunOnLinuxOs() {
		System.out.println("This test run only on Linux Os platform");
		Assertions.assertTrue(true);
	}
	
	@Test
	@DisplayName("Test Run on Linux Operating System")
	@DisabledOnOs({OS.LINUX})
	void testDisableOnLinuxOs() {
		System.out.println("This test run only on otherthan Linux Os platform");
		Assertions.assertTrue(true);
	}
	
	@Test
	@DisplayName("Test Run on JRE 1.8")
	@EnabledOnJre({JRE.JAVA_8})
	void testRunOnJRE8() {
		System.out.println("This test run only on Java 8 platform");
		Assertions.assertTrue(true);
	}
	
	@Test
	@DisplayName("Test Run on JRE 11")
	@EnabledOnJre({JRE.JAVA_11})
	void testRunOnJRE11() {
		System.out.println("This test run only on Java 11 platform");
		Assertions.assertTrue(true);
	}
	
	@Test
	@DisplayName("Test Run on random number")
	@DisabledIf("Math.random()<0.314")
	void testRunOnSomeRandomNumber() {
		System.out.println("This test may or may not execute.");
		Assertions.assertTrue(true);
	}
}
