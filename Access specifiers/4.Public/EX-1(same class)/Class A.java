package p1;

public class A {
public int x = 10;
public void test() {
	System.out.println(1000);

}
public static void main(String[] args) {
	A a1 = new A();
	System.out.println(a1.x);
    a1.test(); //if we make variable/method public, then it can be accessed everywhere.
}
}
