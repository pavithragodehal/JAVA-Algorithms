package app_2;

public class A {
public static void main(String[] args) {
	A a1 = new A();
	a1.test(); // method calling statement.
}
public void test() {
	System.out.println(100);
      return; // return will transfer control to method calling statement, it is optional to use method here.
   //   System.out.println(200); // we cant write anything after 'return',(unreachable code error). 
}
}
