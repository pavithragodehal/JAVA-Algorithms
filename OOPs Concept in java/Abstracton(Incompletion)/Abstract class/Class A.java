package p1; 
//Incomplete and complete methods
abstract public class A {
	int x =10;
	static int y = 100;
	A(){ //constructor
	}
	abstract public void test1(); //Incomplete Metod, using abstract keyword is mandatory in class.
	public void test2 () { //complete method 
		System.out.println(100);
	}
	
public static void main(String[] args) { //main method
	A a1 = new A(); //error
	
}
}
