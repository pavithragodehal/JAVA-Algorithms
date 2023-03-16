package p2;

	//static initialization block (SIB)
// with test method,IIB and constructor after main method.
	public class D { 
		public void test() {
			System.out.println("From Test");
			}
		
		public static void main(String[] args) {
			new D().test();
		}
		{ // IIB
			System.out.println("From IIB");
		}
			D() { //constructor
				System.out.println("From constructor");
			}
			
}
