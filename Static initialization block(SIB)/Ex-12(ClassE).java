package p2;
//static initialization block (SIB)

public class E {
	{
		System.out.println("From IIB");
		new E();
		}
	
	public static void main(String[] args) {
		E a1 = new E();
		System.out.println("From IIB");
		//if we create an object inside IIB,we'll not get any error but than the program will halt abruptly.
	}
		}
		

