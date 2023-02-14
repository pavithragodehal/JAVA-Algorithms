package app_1;

public class B {
	static int i = 10000; 
	static short s = 1000; 
	static byte b = 10; 
	static long l= 88256952555L; // Long data type should be terminated with "L".
	static float f = 10.3F; // Float data type should be terminated with "F".
	static double d = 10.3; 
	static char c = '@';  // Anything single character in 'single quote'.
	static boolean e = true; // Shouldn't not be in quotes nor in uppercase, must be in lowercase. 
	static String g = "pavithra"; // String's S should start with uppercase & vale in "doubble quotes".
  public static void main(String[] args) {
	  System.out.println(B.i); 
	  System.out.println(B.s); 
	  System.out.println(B.b);
	  System.out.println(B.l);
	  System.out.println(B.f);
	  System.out.println(B.d);
	  System.out.println(B.c);
	  System.out.println(B.e);
	  System.out.println(B.g);

  }
  
}

