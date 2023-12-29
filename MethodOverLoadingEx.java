package com.ot9.oops;

public class MethodOverLoadingEx {
	public void add(float a, float b) {
		System.out.println("add of two float's " + (a + b));
	}

	public void add(int a, int b) {
		System.out.println("add of two int's " + (a + b));
	}

	public void add(int a, int b, int c) {
		System.out.println("add of threes int's " + (a + b + c));
	}

	public void add(int a, float b) {
		System.out.println("add of int ,float " + (a + b));
	}

	public void add(float a, int b) {
		System.out.println("add of float,int " + (a + b));
	}

	public static void main(String[] args) {
		MethodOverLoadingEx obj = new MethodOverLoadingEx();
		obj.add(12, 13);
		obj.add(12.43f, 32.4f);
		obj.add(12, 12.45f);
		obj.add('a','b');//type promotion
	}

}
