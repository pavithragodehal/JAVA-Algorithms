/* Reference variable --->1.Local reference variable
                          2.static reference variable */
package app_1;

public class D {
	 static A x; // 'x' is static variable & as global access, can be used anywhere in the program.
	 static A b1; // Default value for a static reference variable is 'null'.
	 public static void main(String[] args) {
		System.out.println(b1);
        A a1 = new A(); // 'a1' is a local variable, & can be used only in this method. NO ERROR.
		System.out.println(a1);
		x = new A();
		System.out.println(x);
		x.test();
     }
     public void test() {
        System.out.println(a1); // Error, bcz 'a1' is a local variable of main method.
		System.out.println(x);

     }
     
}
