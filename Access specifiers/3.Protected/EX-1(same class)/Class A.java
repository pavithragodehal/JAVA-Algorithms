package p1;

public class A {
protected int x = 10;
protected void test() {
	System.out.println(1000);

}
public static void main(String[] args) {
	A a1 = new A();
	System.out.println(a1.x);
    a1.test(); //No error,bcz if we make variable/method default,then it can be accessed only in same class, same package & in different packages only via inheritance
}
}
