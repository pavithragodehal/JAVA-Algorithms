package app_2; 

public class C {
	int x;
	public static void main(String[] args) {
		C a1 = new C();	
		a1.test();
		System.out.println(a1.x);
		
		}
	public void test() {
		int x=10;
		this.x=x;
	}
		}


