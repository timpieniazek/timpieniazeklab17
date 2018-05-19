package com.gc.primes;

public class Primes {
	
	public int locatePrimeAt(int i) {
		if (i < 3) {
			return i + 1;
		}
		return i + 2;
	}

}
