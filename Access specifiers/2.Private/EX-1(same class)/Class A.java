package p1;

public class A {
private int x = 10;
private void test() {
	System.out.println(1000);
}
public static void main(String[] args) {
	A a1 = new A();
	System.out.println(a1.x);
    a1.test(); // No error,bcz if we make variable/method private,then it can be accessed only in same class but not outside class

}
}
