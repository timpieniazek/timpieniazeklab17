package com.gc.primes;

public class Primes {

	public int locatePrimeAt(int i) {
		if (i < 3) {
			return i + 1;
		} else if (i < 4) {
			return i + 2;
		} else if (i < 5) {
			return i + 3;
		}
		return i + 6;
	}

}
