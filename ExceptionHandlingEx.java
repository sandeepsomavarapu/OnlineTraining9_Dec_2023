package com.ot9.exceptions;

import java.util.Scanner;

public class ExceptionHandlingEx {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first number for division..");
		int fnum = scanner.nextInt();
		System.out.println("Enter second number for division..");
		int snum = scanner.nextInt();
		try {
			int result = fnum / snum;
			System.out.println("division two numbers : " + result);
		} catch (ArithmeticException exception) {
			System.out.println("dont enter zero as denominator ");
		}
		System.out.println("remaining 1000 lines of code....");
		scanner.close();
	}

}
