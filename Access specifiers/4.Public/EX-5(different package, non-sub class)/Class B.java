package p2;
//different package, non-sub class
import p1.A;
public class B  {
	public static void main(String[] args) {
		A a1 = new B();
		System.out.println(a1.x);
                a1.test(); /* if we make variable/method public, then it can be accessed everywhere.*/
	}
}
