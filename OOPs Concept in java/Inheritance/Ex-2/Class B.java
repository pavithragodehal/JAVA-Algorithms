package app_3;// child class

public class B extends A {
public static void main(String[] args) {
	B b1 = new B(); // In this object the value of "x" from class A is stored.
	System.out.println(b1.x);
	b1.test();// Method called from class A.
}
}
