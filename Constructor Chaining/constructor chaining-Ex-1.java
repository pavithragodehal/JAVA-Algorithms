package app_2; 


public class A {
	A(){ //constructor #1
		System.out.println(100);
	}
A(int x){ //constructor #2
	this(); // calling constructor #1
}
	
public static void main(String[] args) {
	A a1 = new A(100);
}	
}
