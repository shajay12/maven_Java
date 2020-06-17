package com.mkyong;

import org.junit.Assert.*;
import org.junit.Test;

public class AppTest {

	@Test
	public void testLengthOfTheUniqueKey() {

		App obj = new App();
		Assert.assertEquals(36, obj.generateUniqueKey().length());

	}
	@Test
	public void sampletestpass() {
		int a = 1;
		int b = 2;
		assertTrue(a + b == 3);
	}
}
