package com.gc.primes;

public class Primes {

	public int locatePrimeAt(int index) {
		// if (i < 3) {
		// return i + 1;
		// } else if (i < 4) {
		// return i + 2;
		// } else if (i < 5) {
		// return i + 3;
		// } else if (i < 6) {
		// return i + 6;
		// }
		// return i + 7;
		int num = 2;
		for (int i = 1; i < index; i++) {
			num++;
			int div = (int) num / 2;
			while (div > 1) {
				while (num % div == 0) {
					num++;
				}
				div--;
			}
		}
		return num;

	}

	public boolean isPrime(int number) {
		for (int divisor = 2; divisor < number; divisor++) {
			if (number % divisor == 0) {
				return false;
			}
		}
		return true;
	}
}
