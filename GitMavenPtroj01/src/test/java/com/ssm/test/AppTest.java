package com.ssm.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.ssm.service.Arethmetic;

public class AppTest {
	Arethmetic ar = new Arethmetic();
	@Test
	public void testWithPositves() {
		Arethmetic ar = new Arethmetic();
		int expected =60;
		int actaul = ar.doSum(40, 20);
		assertEquals(expected, actaul);
	}
	
	public void testWithNegatives() {
		int expected = -50;
		int actual = ar.doSum(-25, -25);
		assertEquals(expected, actual);
	}
	
	public void testWithZero() {
		int expectes = 0;
		int actual= ar.doSum(0, 0);
		assertEquals(expectes, actual);
	}
}
