package p1; 
public class A {
	public void test() { //Method #1
		System.out.println(100);
	}
	public void test(int x) { //Method #2 
		System.out.println(x);
	}
	public void test(String x) { //Method #3
		System.out.println(x);
	}
public static void main(String[] args) { //Method #4
	A a1 = new A();
	a1.test();
	a1.test(200);
	a1.test("pankaj sir Academy");
	
}
}
