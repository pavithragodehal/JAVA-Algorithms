package app_2;

public class E {
	int x = 10;
	public static void main(String[] args) {
		E a1 = new E();
        a1.test();
	}

public void test() { 
	     System.out.println(x); //this.x appended automatically.
	}
}

