package app_2;

public class B {
	public static void main(String[] args) {
		B a1 = new B();
		int x = a1.test(); // before 'x' we're writing return value's data type ,& then calling te method.
		System.out.println(x);
		
	}
	public int test() { // here there's no 'void' but the 'int' because the returning value is integer.
	      return 100;  
	}
	}

