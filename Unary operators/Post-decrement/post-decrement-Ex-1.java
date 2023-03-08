package app_2;


public class A {
	public static void main(String[] args) {
	int i=10;
	int j= i-- + i--;// post-decrement.
	System.out.println(i);// 8
	System.out.println(j);// 19
         
	}	
}
