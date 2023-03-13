package p1;
//same package, sub class
public class B extends A {
	public static void main(String[] args) {
		B a1 = new B();
		System.out.println(a1.x);
        a1.test(); //Error,bcz if we make variable/method private,then it can be accessed only in same class but not outside class
	}

}
