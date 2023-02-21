package app_2;

public class E {
	public static void main(String[] args) {
		E a1 = new E();
		boolean x = a1.test(); // before 'x' we're writing boolean ,& then calling te method.

		System.out.println(x);
		
	}
	public boolean test() { // here there's no 'void' but the 'boolean' because the returning value is integer.

	      return true;  
	}
}

