package p1;
//polymorphism
public class B extends A{
	@override
	public void test1(int y) { //argument:data type should match, variable name can be anything.
			System.out.println(y); 
	}
		public static void main(String[] args) {
			B b1 = new B();
			b1.test1(800);
		}

	}
	

