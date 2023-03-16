package p1;
//Instance initialization block (IIB)

public class E {
	E() { //constructor
		System.out.println("From constructor");
	}
	{ //IIB
		System.out.println("From IIB");
	}
	public static void main(String[] args) {
		E a1 = new E();
		System.out.println("From main");
		//creating one main & constructor with IIB & see which is called first.
	}

}
