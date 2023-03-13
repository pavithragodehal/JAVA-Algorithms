package p2;
//different package, sub class
public class B extends A {
	public static void main(String[] args) {
		B b1 = new B();
		System.out.println(b1.x);
        b1.test(); //Error,bcz if we make variable/method private,then it can be accessed only in same class but not outside class.

	}

}
