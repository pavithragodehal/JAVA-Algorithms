package p2; //Multiple IIBs
//Instance initialization block (IIB)

public class A {
	{ // IIB-1
		System.out.println("From IIB");
	}
		A() { //constructor
			System.out.println("From constructor");
		}
		{ //IIB-2
			System.out.println("From IIB");
		}
		public static void main(String[] args) {
				A a1 = new A();
			
			//creating one constructor with IIB twice & see which is called first.
		}
	}


