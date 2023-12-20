package com.ot9.basics;

import java.util.Scanner;

 class ScannerEx {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Employee Id : ");
		int eid = scanner.nextInt();
		System.out.println("Enter Employee Name : ");
		String ename = scanner.next();
		System.out.println("Enter Employee Salary : ");
		float esal = scanner.nextFloat();
		System.out.println("Enter Employee Contact : ");
		long econtact = scanner.nextLong();
		System.out.println("Enter Employee Designation : ");
		String desg = scanner.next();
		System.out.println(" Employee Info : ");
		System.out.println(desg + "" + eid + " " + ename + " " + " " + econtact + " " + esal);
		scanner.close();
	}

}
