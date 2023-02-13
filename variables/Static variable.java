package app_1;

public class A {
	static int x = 10; // static variable(Global: can be used in any method with class name)
	static int y; //  it is not mandatory to initialize default value "0" gets stored depending on 'data type'.
  public static void main(String[] args) {
	  // we can access static variables in 3 ways.
	  System.out.println(A.x); // 1.standard way.
	  System.out.println(x); // Didn't write class name but java compiler converts 'x' to 'A.x' internally.
	  System.out.println(A.x); 
	  A a1 = new A();
      A.test(); // we're calling the below static method directly with class name.
	  System.out.println(a1.x); // wrong, but it still works, beginners do this (compiler corrects mistake).
      A.x = 25; // static variables value can be changed as shown. 
	  System.out.println(A.x);
	  System.out.println(y); 
  }
  public static void test() { // we applied "static" here & it became static method. 
	  System.out.println(A.x);
  }
}


