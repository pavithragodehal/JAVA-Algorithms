package p2;
//static initialization block (SIB)

public class C {
	static int i;
    static
		 { 
			 i=25;
			System.out.println(i);
		}
		public static void main(String[] args) {
		System.out.println("From main");
		}
	}