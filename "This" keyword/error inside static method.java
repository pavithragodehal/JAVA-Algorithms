package app_2;// "this" keyword cannot use inside static methods

public class D {
	
		public static void main(String[] args) {
			D a1 = new D();	
			a1.test();
			System.out.println(this);//error
			}
		public static void test() {
			System.out.println(this); //error
			}
		}

	
 