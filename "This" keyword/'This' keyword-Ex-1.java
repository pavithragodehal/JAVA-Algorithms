package app_2;

public class A {
	
public static void main(String[] args) {
	A a1 = new A();
	System.out.println(a1);
	a1.test();
}
public void test() {
	System.out.println(this);// prints same address twice
}
}
