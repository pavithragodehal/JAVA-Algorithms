package app_2; 

public class C {
	int x; //non static variable
	public static void main(String[] args) {
		C a1 = new C();	
		a1.test();
		System.out.println(a1.x);
		
		}
	public void test() { //non static method
		int x=10; //local variable
		this.x=x; // "this.x" is calling non static variable (line #2), and "x" value copied from local variable.
	}
		}


