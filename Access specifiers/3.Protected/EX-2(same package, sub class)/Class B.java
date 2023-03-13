package p1;
//same package, sub class
public class B extends A {
	public static void main(String[] args) {
		B a1 = new B();
		System.out.println(a1.x);
        a1.test(); /*No error,bcz if we make variable/method default,then it can be accessed
        only in same class, same package but not in different packages.*/
	}
}
