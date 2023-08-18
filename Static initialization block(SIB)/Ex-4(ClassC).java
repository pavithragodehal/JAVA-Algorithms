package p1;
//static initialization block (SIB)

public class C {
	//IIB,SIB, and constructor Flow 
	static { //SIB-1
		System.out.println("From SIB-1");
	}
	static { //SIB-2
		System.out.println("From SIB-2");
		new C();
	}
		{ // IIB
			System.out.println("From IIB");
		}
			
			public static void main(String[] args) {
				new C();
				// Multiple object created, in SIB and Main.
			}
		}


		



