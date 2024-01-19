package com.ot9.exceptions;

import java.util.Scanner;

public class Exception3 {
	static Scanner scan;

	public static void main(String args[]) {
		int a1 = 0;
		a1 = 123;

		try {
			scan = new Scanner(System.in);
			int a[] = new int[5];// 0,1,2,3,4
			a[4] = 30 / 0;
			String s = null;
			int x = Integer.parseInt(s);
			System.out.println(s.length());
			// System.out.println("no error " + a[4]+" "+x);
		} catch (ArrayIndexOutOfBoundsException ae) {// jvm
			System.out.println("please enter valid index");
		} catch (ArithmeticException e) {
			System.out.println("dont enter zero as denominator");
		} catch (NumberFormatException e) {
			System.out.println("we cant convert string to number");
		}

		finally {
			scan.close();// cleanup
			System.out.println("executes every time for closing connections");
		}
		System.out.println("remaining code  executed...");
	}
}