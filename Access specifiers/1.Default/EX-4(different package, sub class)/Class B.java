package p2;
import p1.A;
public class B extends A{
//different package, sub class
		public static void main(String[] args) {
			B a1 = new B();
			System.out.println(a1.x);
	        a1.test(); //Error,bcz if we make variable/method default,then it can be accessed only in same class, same package but not in different packages.

		}

	}

}
