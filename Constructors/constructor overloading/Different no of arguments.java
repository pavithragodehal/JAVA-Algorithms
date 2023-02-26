package app_2;//different no of arguments.

public class C {
	C(){//no0fargs = 0
		System.out.println(1);
	}
	C(int x){//no0fargs = 1
		System.out.println(x);
	}
	C(int x, int y){//no0fargs = 2
		System.out.println(x);
		System.out.println(y);
	}
	
	public static void main(String[] args) {
		C a1 = new C();		
		C a2 = new C(2);	
		C a3 = new C(3,4);	
		}
		}


