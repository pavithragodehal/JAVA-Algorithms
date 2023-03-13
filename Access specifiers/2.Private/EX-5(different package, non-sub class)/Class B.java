package p2;
//different package, non-sub class.
import p1.A;
public class B {
	public static void main(String[] args) {
		A a1 = new A();
		System.out.println(a1.x);
        a1.test(); //Error,bcz if we make variable/method private,then it can be accessed only in same class but not outside class.

	}

}
