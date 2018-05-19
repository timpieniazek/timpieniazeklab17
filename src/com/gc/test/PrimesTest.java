package com.gc.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.gc.primes.Primes;

class PrimesTest {

	@Test
	void test1() {
		Primes obj = new Primes();
		int expected = 2;
		int actual = obj.locatePrimeAt(1);
		assertEquals(expected, actual);
	}

	@Test
	void test2() {
		Primes obj = new Primes();
		int expected = 3;
		int actual = obj.locatePrimeAt(2);
		assertEquals(expected, actual);
	}
	
}
