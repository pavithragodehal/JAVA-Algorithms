package p1;
//static initialization block (SIB)
public class G {
	
	{
		System.out.println("From IIB");
	}
	G(){
		System.out.println("From constructor");
	}
	static
	{
		System.out.println("From SIB");
	}
	
	public static void main(String[] args) {
		G a1 = new G();
        System.out.println("From main");
		// To understand the flow b/w SIB,IIB,Constructor and Main
	}

}

