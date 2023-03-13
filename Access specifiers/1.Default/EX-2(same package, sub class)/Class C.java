package app_3;

public class C extends B{
public static void main (String[] args) {
	C a1 = new C();
	System.out.println(a1.x);
	a1.test(); //No error,bcz if we make variable/method default,then it can be accessed only in same class, same package but not in different packages.

}
}
