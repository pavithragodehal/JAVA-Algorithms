package p2;
//static initialization block (SIB)

public class B {
	int i;
	static
		 { 
			 i=100;
			System.out.println(i);
		}
		
		public static void main(String[] args) {
				System.out.println("From Main");
			//Error,SIB can only initialize static variable, it cannot initialize no static variable.
		}
	}
