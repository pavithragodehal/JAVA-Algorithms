package app_2; // if there is multiple objects created then "this" keyword points to current object running in the program.

public class A {
	
public static void main(String[] args) {
	A a1 = new A();
	a1.test();// running object a1
	A a2 = new A();
	a2.test();// running object a2
}
public void test() {
	System.out.println(this);// we called "this" twice, so it printed what object was running at that moment.
}
}
