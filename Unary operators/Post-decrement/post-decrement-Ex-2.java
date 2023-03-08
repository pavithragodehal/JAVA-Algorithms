package app_2;


public class B {
	public static void main(String[] args) {
	int i=10;
	int j= --i + --i;
	//       9    8
	System.out.println(i);// 8
	System.out.println(j);// 9+8=17
         
	}	
}
