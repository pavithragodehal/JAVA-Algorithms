package app_1;

public class A {
	  int x = 10; //non static variable
	  int y = 20; //non static variable
	  static int Z = 100; //static variable
	public static void main(String[] args) {
		  A a1 = new A();
      System.out.println(a1.x); 
	  System.out.println(a1.y); 
	  System.out.println(A.Z); 
  }  
}


