package p2;
//different package, sub class
import p1.A;
public class B extends A {
	public static void main(String[] args) {
		B b1 = new B();
		System.out.println(b1.x);
                b1.test(); /* if we make variable/method public, then it can be accessed everywhere.*/
	}

}
