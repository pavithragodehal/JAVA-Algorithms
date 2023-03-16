package p1;
//Instance initialization block (IIB)

public class F {
	F() { //constructor
		System.out.println("From constructor");
	}
	{ //IIB
		System.out.println("From IIB");
	}
	public static void main(String[] args) {
		System.out.println("Start main");
		F a1 = new F();
		System.out.println("End main");
		//creating one start main, end main, constructor with IIB & see which is called first.
	}
}