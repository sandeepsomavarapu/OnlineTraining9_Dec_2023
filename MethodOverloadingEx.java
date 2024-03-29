package com.ot9.oops;

public class MethodOverloadingEx {

	public void add(int a, int b, int c) {
		System.out.println("add of three int's : " + (a + b + c));
	}

	public void add(int a, int b) {
		System.out.println("add of two int's : " + (a + b));
	}

	public void add(float a, float b) {
		System.out.println("add of two float's : " + (a + b));
	}

	public void add(int a, float b) {
		System.out.println("add of two int's : " + (a + b));
	}

	public void add(float a, int b) {
		System.out.println("add of two int's : " + (a + b));
	}

	public static void main(String[] args) {
		MethodOverloadingEx obj = new MethodOverloadingEx();
		obj.add(12, 13);
		obj.add(12.3f, 43.34f);
		obj.add(12, 13, 14);
		obj.add('a','b');//type promotion a-97 A-65

	}
}
