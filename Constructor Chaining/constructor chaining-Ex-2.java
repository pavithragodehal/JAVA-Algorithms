package app_2; 

public class B {
		B(){ 
			this(100); //we're calling line #5
      }
	B(int x){ 
		System.out.println(100);
	}
		
	public static void main(String[] args) {
		B a1 = new B(); //we're calling line #2
	}	
	}

	