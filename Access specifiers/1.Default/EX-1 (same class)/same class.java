package app_3;

public class A {
	int x =10; //Access specifier = default (not writing anything before variable makes it default)
	void test() {
	System.out.println(1000);
	}
	public static void main(String[] args) {
		A a1 = new A();
		System.out.println(a1.x);
		a1.test(); //No error,bcz if we make variable/method default,then it can be accessed only in same class, same package but not in different packages.
	}
}

