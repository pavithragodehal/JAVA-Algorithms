package p1;
//polymorphism
public class B extends A{
	public void test() { //here test method is taking more than one form
			System.out.println(500); //overriding 500 with 100 in class A
	}
		public static void main(String[] args) {
			B b1 = new B();
			b1.test();
			
			A a1 = new A(); // we created object of the parent class, so it printed 100
			a1.test();
			
		}

	}
	

