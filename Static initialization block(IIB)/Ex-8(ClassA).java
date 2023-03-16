package p2; //Object created in SIB
//static initialization block (SIB)
//IIB,SIB, and constructor Flow

public class A { 
	
	{ // IIB
		System.out.println("From IIB");
	}
		A() { //constructor
			System.out.println("From constructor");
		}
		static { //SIB
			new A();//Object created in SIB, so due to this IIB runs then constructor called
			System.out.println("From SIB");
		}
		public static void main(String[] args) {
			System.out.println("From Main");
			
		}
	}


