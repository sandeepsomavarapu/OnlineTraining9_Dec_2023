package com.ot9.exceptions;

import java.util.Scanner;

class InvalidCredentials extends Exception {
	public InvalidCredentials(String message) {
		super(message);
	}
}

public class Throw_Ex {

	public static void validate(String username, String password) throws InvalidCredentials {
		if (username.equals("sandeep") && password.equals("sandeep@123")) {
			System.out.println("LOGIN SUCCESS");
		} else {
			throw new InvalidCredentials("Enter Valid Credentials");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Username ");
		String username = sc.next();
		System.out.println("Enter Password");
		String password = sc.next();
		try {
			Throw_Ex.validate(username, password);
		} catch (InvalidCredentials e) {
			System.out.println("credentials are wrong recheck again....");
		} finally {
			System.out.println("executes always....");
		}
		sc.close();
	}
}
