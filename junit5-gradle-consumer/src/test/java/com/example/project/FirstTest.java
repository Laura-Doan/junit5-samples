
package com.example.project;

import static org.junit.gen5.api.Assertions.assertEquals;

import org.junit.gen5.api.Name;
import org.junit.gen5.api.Test;
import org.junit.gen5.api.TestName;

class FirstTest {

	@Test
	@Name("My 1st JUnit 5 test! 😎")
	void myTest(@TestName String testName) {
		assertEquals(2, 1 + 1, "1 + 1 should equal 2");
		assertEquals("My 1st JUnit 5 test! 😎", testName, () -> "testName is injected correctly");
	}

}
