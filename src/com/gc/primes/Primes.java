package com.gc.primes;

public class Primes {

	public int locatePrimeAt(int index) {
		
		int num = 2; // initializes first prime number as 2
		for (int i = 1; i < index; i++) { // cycles each prime number, starting in second position as 3
			num++; // advances prime number to at least the next vale
			int div = (int) num / 2; // only need to divide up to half to find lowest common denominator
			while (div > 1) { // checks for divisibility only by "one" at itself
				while (num % div == 0) {
					num++; // if the next number to check is not a prime, trys the next number
				}
				div--; // counts the divisor down, up to not including 1
			}
		}
		return num; // returns processed prime number

	}

}
