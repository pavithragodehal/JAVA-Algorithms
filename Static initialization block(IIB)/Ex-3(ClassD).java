package p1;
//static initialization block (SIB)

public class D {
	static
	 { //SIB
		System.out.println("From SIB");
	}
	
	{ //IIB
		System.out.println("From IIB");
	}
	public static void main(String[] args) {
		D a1 = new D();
		//creating one SIB with IIB & see which is called first.
	}

}

