package p1;
public class B extends A{
	public static void main(String[] args) {
			B b1 = new B();
			b1.test(); //calling non static member
			System.out.println(b1.x);//printing non static member
		        b1.example();//calling overriden abstract method
			System.out.println(A.y);//calling static member with ClassName

		
		}
	@override
	public  void example() { 
	System.out.println(300);
	}
}
	

