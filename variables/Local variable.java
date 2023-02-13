package app_1;

public class C {                                                       
	    public static void main(String[ ] args) {                          
		   /*int x = 10;// Local Variable (Created inside main method).      
		      System.out.println(x); */
	       /*int y; //Error, it's mandatory to initialize local variable before using it or else we get error 
		      System.out.println(y);*/
	    	int x = 10; // Correct, bcz created in main method & used in main method.
		    System.out.println(x); 
		    C.test(); 
		   //System.out.println(x);// Error bcz 'x' variable belongs to the test method.  
	}                                                                      
		public static void test() { 
			int x =10; // Local Variable (Created inside test method).
			//System.out.println(x);// Error bcz 'x' variable belongs to the main method.  
			System.out.println(x); // No error.
		}                                                                  
	                                                                       
	}                                                                      
	                                                                       
