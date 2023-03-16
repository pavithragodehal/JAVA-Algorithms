package p1;
//static initialization block (SIB)


public class F {
	{
		System.out.println("From IIB-1");
	}
	{
		System.out.println("From IIB-2");
	}
	F(){
		System.out.println("From constructor");
	}
	static
	{
		System.out.println("From SIB");
	}
	
	public static void main(String[] args) {
		F a1 = new F();
        System.out.println("From main");
		// To understand the flow b/w SIB,IIB-1,IIB-2,Constructor and Main
	}

}



