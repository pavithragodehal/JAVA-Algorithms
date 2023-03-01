package app_2; 

public class B {
	
	public static void main(String[] args) {
		B a1 = new B();
		a1.test();
		
		B a2 = new B();
		a2.test();
		a1.test();
	}
	public void test() {
		System.out.println(this);
	}
	}

