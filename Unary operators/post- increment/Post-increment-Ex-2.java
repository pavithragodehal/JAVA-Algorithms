package app_2; 

public class B {
	public static void main(String[] args) {
		int i=10;
		int j=i++ + i++ + i++;// post-increment (bcz after variable)
		// "++" means increase te value by 1 only when we see the same variable next time.
		System.out.println(i);// 13
		System.out.println(j);//10+11+12=33
	         // first i++=10,second i++=11,third i=12 and fourth i=13.
		}	
	}