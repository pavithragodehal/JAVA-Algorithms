package p1;
//polymorphism
public class B extends A{
	public void test2() { 
			System.out.println(500); //overriding only test2's logic
	}
		public static void main(String[] args) {
			B b1 = new B();
			b1.test1();
			b1.test2();
		}

	}
	

