package p2;
//static initialization block (SIB)
//multiple objects in SIB
public class F {
	{
		System.out.println("From IIB");
	}
	static
	{
		new F();
		System.out.println("From SIB");
		new F();
		}
	
	public static void main(String[] args) {
		System.out.println("From main");
	}
		}
		



