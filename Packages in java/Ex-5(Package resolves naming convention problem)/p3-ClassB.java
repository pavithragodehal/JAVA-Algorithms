package p3;
//Packages resolves naming convention problems in java,that is we can create more than one class in the same project provided packages are different. 
public class B {
	public static void main(String[] args) {
		//p1
		p1.A a1 = new p1.A();
		System.out.println(a1);
		//p2
		p2.A a2 = new p2.A();
		System.out.println(a2);
	}
}
