package app_2;


public class C {
	public static void main(String[] args) {
	int i=10;
	int j= --i + ++i + i + i++ + i-- ;// All mixed.
	//      9     10   10   10   11
	System.out.println(i);// 10
	System.out.println(j);// 9+10+10+10+11=50
         
	}	
}
