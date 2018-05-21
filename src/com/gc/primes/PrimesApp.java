package com.gc.primes;

import java.util.Scanner;

public class PrimesApp {

	public static void main(String[] args) {
		Primes primes = new Primes();
		Scanner scan = new Scanner(System.in);
		String cont = "y";
		int input;
		int output;
		
		System.out.println("Let's locate some primes!\n");
		System.out.println("This application will find you any prime, " +
				"in order, from first prime number on.");
		
		while (cont.equalsIgnoreCase("y")) {			
			input = Validator.getInt(scan, "Which prime number are you looking for? ",
					1, Integer.MAX_VALUE);
			output = primes.locatePrimeAt(input);
			
		
			System.out.printf("%nThe prime number %s prime is %s.", input, output);
			
			Validator.getYesOrNo(scan, "\nDo you want to find another prime number? (y/n): ");
			System.out.println();				
		}
		
		System.out.println("Thank you! Goodbye!");	

	}

}
