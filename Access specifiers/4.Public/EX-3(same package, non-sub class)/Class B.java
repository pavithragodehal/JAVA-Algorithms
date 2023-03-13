package p1;
//same package, non-sub class
public class B  {
	public static void main(String[] args) {
		A a1 = new A();
		System.out.println(a1.x);
                a1.test(); /* if we make variable/method public, then it can be accessed everywhere.*/
	}

}
