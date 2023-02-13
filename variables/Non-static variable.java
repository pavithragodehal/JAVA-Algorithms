package app_1;

public class B {
		int x = 10; // It's non-static & it gets loaded into object (main copy).
		static int y = 20; // It's static & gets loaded into meta space.
	  public static void main(String[] args) {
		  B a1 = new B(); // Created new object.
		  a1.x = 100; // Value changed, as it's the xerox of the main copy it won't effect main copy.
		  B a2 = new B(); // Every time we create object copy of non-static will be loaded into that object.  
		  B a3 = new B();
		  System.out.println(a1.x);
		  System.out.println(a2.x);
		  System.out.println(a3.x);
		  System.out.println(B.y);
		  a1.test(); // We are calling the below non static method 
	 }
	  public void test(){ // Non static method
		  System.out.println(200);
	  }
	}


