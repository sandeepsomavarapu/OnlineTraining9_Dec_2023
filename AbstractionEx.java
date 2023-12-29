package com.ot9.oops;

import java.util.Date;

interface SuperParentEx {
	int result = 123;// public static final int result=123;

	void withdraw(int amount);// public abstract void withdraw();

	public abstract void deposit(int amount);
}

abstract class ParentEx1 implements SuperParentEx {
	int balance = 2000;

	public void printAge() {
		int age = 123;
		System.out.println("Age is :" + age);
	}

	public abstract void printWeight();

}

public class AbstractionEx extends ParentEx1 {

	public void displayDate() {
		Date date = new Date();
		System.out.println("Today's Date :" + date);
	}

	public void displayMsg() {

		System.out.println("Hello Everyone!!!");
	}

	public static void main(String[] args) {
		AbstractionEx obj = new AbstractionEx();
		obj.displayDate();
		obj.displayMsg();
		obj.printAge();
		obj.printWeight();
		System.out.println(AbstractionEx.result);
	}

	@Override
	public void printWeight() {
		System.out.println("weight is : " + 111);

	}

	@Override
	public void withdraw(int amount) {
		balance = balance - amount;
		System.out.println("available balance now" + balance);
	}

	@Override
	public void deposit(int amount) {

		balance = balance + amount;
		System.out.println("available balance now" + balance);
	}

}
