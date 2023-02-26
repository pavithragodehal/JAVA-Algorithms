package app_2;

public class A {
	A(){ // constructor name should be same as classname.
		System.out.println(100);
		/*return 100;  error, constructors are permanently internally void
		                 & can never return any value.  */
	}
public static void main(String[] args) {
	A a1 = new A();
	A a2 = new A();
	A a3 = new A();
// as many times an object is created , constructer gets called.
}
}
