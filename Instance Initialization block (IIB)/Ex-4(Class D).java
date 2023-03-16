package p1;
// Instance initialization block (IIB)
public class D {
	D() { //constructor
		System.out.println("From constructor");
	}
	{ //IIB
		System.out.println("From IIB");
	}
	public static void main(String[] args) {
		D a1 = new D();
		//creating one constructor with IIB & see which is called first.
	}

}

