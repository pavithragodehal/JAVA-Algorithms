package app_2;// different type of arguments.

public class D {
		D(int x){//no0fargs = 0
			System.out.println(x);
		}
		D(char x){//no0fargs = 1
			System.out.println(x);
		}
		D(boolean x){//no0fargs = 1
			System.out.println(x);
		}
		D(double x, String y){//no0fargs = 2
			System.out.println(x);
			System.out.println(y);
		}
		
		public static void main(String[] args) {
			D a1 = new D(100);		
			D a2 = new D('a');	
			D a3 = new D(true);	
			D a4 = new D(25.6 , "pavithra");
			}
			}

	
