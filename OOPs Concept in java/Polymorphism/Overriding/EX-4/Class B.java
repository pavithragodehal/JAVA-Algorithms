package p1;
//polymorphism
public class B extends A{
	@override // To check whether override is happening or not.
	public void test() { //Error
			System.out.println(500); 
	}
		public static void main(String[] args) {
			B b1 = new B();
			b1.test1();
		}
	}
	

