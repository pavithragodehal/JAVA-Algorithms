package app_2; //we can access non static members of class

public class C {
	int x=10;
	public static void main(String[] args) {
		C a1 = new C();		
		System.out.println(a1.x);
		a1.test();
		
		}
	public void test() {
		System.out.println(this.x); // prints same address twice
	}
		}


