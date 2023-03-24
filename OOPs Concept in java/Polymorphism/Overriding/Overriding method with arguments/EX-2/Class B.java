package p1;
//polymorphism
public class B extends A{
	@override
	public int test() { 
		int x = 1000;
		return x;
	}
		public static void main(String[] args) {
			B b1 = new B();
			int val = b1.test();
			System.out.println(val);
		}

	}
	

