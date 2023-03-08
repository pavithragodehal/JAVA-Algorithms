package app_2;// 

public class D {
	
	public static void main(String[] args) {
		int i=10;
		int j= i++ + i++ + i + i++ + i + i++;
		//     10    11   12   12    13   13
		// here we didn't apply ++ in 3rd i & 5th i so it means no increment when we see next time.
		// so value remains same as previous i++
		System.out.println(i);// 14
		System.out.println(j);//10+11+12+12+13+13=71
	       
		}	
	}

	
 
