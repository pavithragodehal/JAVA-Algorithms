package p1;

public class A {
protected int x = 10;
protected void test() {
	System.out.println(1000);

}
public static void main(String[] args) {
	A a1 = new A();
	System.out.println(a1.x);
    a1.test();
}
}
