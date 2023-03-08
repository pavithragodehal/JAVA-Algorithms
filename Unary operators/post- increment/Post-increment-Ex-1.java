package app_2; 


public class A {
	public static void main(String[] args) {
	int i=10;
	int j=i++ + i++;// post-increment (bcz after variable)
	// "++" means increase te value by 1 only when we see the same variable next time.
	System.out.println(i);// here again we see "i" variable,
	System.out.println(j);
         // first i++=10,second i++=11 and third i=12
	}	
}
