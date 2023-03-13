package p2;
import p1.A;
public class B {
//different package, non-sub class
		public static void main(String[] args) {
			A a1 = new A();
			System.out.println(a1.x);
	        a1.test(); //Error,bcz if we make variable/method default,then it can be accessed only in same class, same package but not in different packages.

		}

	}

}
