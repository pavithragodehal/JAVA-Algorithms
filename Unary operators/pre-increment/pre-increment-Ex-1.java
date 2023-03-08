package app_2; //using "this" keyword we can access non static members of class.


public class A {
	public static void main(String[] args) {
	int i=10;
	int j= ++i + ++i;// pre-increment.
	//      11    12
	//Before i there's "++",it means increase in same step, no increment in post variable.
	System.out.println(i);// 12
	System.out.println(j);// 11+12=23
         
	}	
}
