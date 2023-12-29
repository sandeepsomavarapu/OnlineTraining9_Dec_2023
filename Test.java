package pack1;

public class Test {

	public void m1() {
		System.out.println("am from m1 method of Test class");
	}

	public static void main(String[] args) {
		Test test = new Test();
		test.m1();//same class
	}

}

class Sample extends Test {

	public void m2() {
		m1();//same package sub class
	}
}

class Sample1 {

	public void m2() {
		Test test = new Test();
		test.m1();//same package non-sub class
	}
}