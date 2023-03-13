package p2;
//different package, sub class
import p1.A;
public class B extends A {
	public static void main(String[] args) {
		B b1 = new B();
		System.out.println(b1.x);
                b1.test(); /*No error,bcz if we make variable/method default,then it can be accessed
                             only in same class, same package but not in different packages.*/
	}

}
