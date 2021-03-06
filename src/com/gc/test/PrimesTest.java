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

	@Test
	void test3() {
		Primes obj = new Primes();
		int expected = 5;
		int actual = obj.locatePrimeAt(3);
		assertEquals(expected, actual);
	}

	@Test
	void test4() {
		Primes obj = new Primes();
		int expected = 7;
		int actual = obj.locatePrimeAt(4);
		assertEquals(expected, actual);
	}

	@Test
	void test5() {
		Primes obj = new Primes();
		int expected = 11;
		int actual = obj.locatePrimeAt(5);
		assertEquals(expected, actual);
	}

	@Test
	void test6() {
		Primes obj = new Primes();
		int expected = 13;
		int actual = obj.locatePrimeAt(6);
		assertEquals(expected, actual);
	}

	@Test
	void test7() {
		Primes obj = new Primes();
		int expected = 17;
		int actual = obj.locatePrimeAt(7);
		assertEquals(expected, actual);
	}
	
	@Test
	void test8() {
		Primes obj = new Primes();
		int expected = 19;
		int actual = obj.locatePrimeAt(8);
		assertEquals(expected, actual);
	}
	
	@Test
	void test9() {
		Primes obj = new Primes();
		int expected = 23;
		int actual = obj.locatePrimeAt(9);
		assertEquals(expected, actual);
	}
	
	@Test
	void test10() {
		Primes obj = new Primes();
		int expected = 29;
		int actual = obj.locatePrimeAt(10);
		assertEquals(expected, actual);
	}
}
