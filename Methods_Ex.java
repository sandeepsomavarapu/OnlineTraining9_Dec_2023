package com.ot9.basics;

public class Methods_Ex {

	public void addOfTwo(int a, int b) {
		System.out.println("add of two numbers : " + (a + b));
	}

	public int subOfTwo(int a, int b) {
		return a - b;
	}

	public static String displayMsg() {
		return "hello!!! welcome to india...";
	}

	public void divOfTwo() {// default method
		int a = 12;
		int b = 4;
		System.out.println("div of two numbers : " + (a / b));
	}

	public static void main(String[] args) {
		System.out.println(Methods_Ex.displayMsg());

		Methods_Ex obj = new Methods_Ex();
		obj.addOfTwo(12, 13);
		int result = obj.subOfTwo(12, 234);
		System.out.println("sub of two numbers :" + result);
		obj.divOfTwo();

	}

}
