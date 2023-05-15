package p1; 
abstract public class A {
	int X = 100;//non static member
	static int y = 400;//static member
	
	public void test() { // non static method
		System.out.println(200);
	}
	abstract public void example();//abstract method
	
}
