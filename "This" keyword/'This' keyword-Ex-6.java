package app_2; //using "this" keyword we can access non static members of class.


public class A {
	
public static void main(String[] args) {
	A a1 = new A();
	a1.test1();
}
	public void test1() {
	this.test2(); // the member here is a non static.
}
public void test2() {
	System.out.println(500);
}
}
