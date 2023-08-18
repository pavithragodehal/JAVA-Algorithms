package p1;
//static initialization block (SIB)
public class E {
	static
	{ 
		System.out.println("From SIB-1");
	}
	static
	{ 
		System.out.println("From SIB-2"); //Multiple SIBs
	}
	public static void main(String[] args) {
		System.out.println("From main");
		//creating one main & SIB twice & see which is called first.
	}

}
