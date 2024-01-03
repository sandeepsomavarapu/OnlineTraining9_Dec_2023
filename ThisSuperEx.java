package com.ot9.oops;

class Parent1 {
	int marks = 123;

	public Parent1() {
		System.out.println("parent default constructor");
	}

	public Parent1(String orgName) {
		this();
		System.out.println("parent param constructor :" + orgName);
	}

	public void m1() {
		System.out.println("hyderabad");
	}
}

public class ThisSuperEx extends Parent1 {
	int marks = 222;// instance properties can be accessed from instance method/constructor directly
	// instance properties we can't access directly in static area

	public ThisSuperEx() {
		super("capgemini");// parent class default constructor ...called
		System.out.println("am from default constructor..");
	}

	public ThisSuperEx(int marks) {
		this();
		System.out.println("am from  param constructor...." + marks);
		System.out.println(this.marks);
		System.out.println(super.marks);
		this.m1();
		super.m1();
		System.out.println(this);
	}

	@Override
	public void m1() {
		System.out.println("india");
	}

	public static void main(String[] args) {
		ThisSuperEx obj = new ThisSuperEx(232);
		obj.m1();
		System.out.println(obj);//address
	
	}

}
