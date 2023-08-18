package p1; 
//static initialization block (SIB)
public class A {
	{
		System.out.println("From SIB");
	}
	public static void main(String[] args) {
		//No output,because no object is created,SIB will not be called
	}

}
