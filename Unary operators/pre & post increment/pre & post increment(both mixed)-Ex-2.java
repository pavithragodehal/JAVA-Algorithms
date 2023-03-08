package app_2;

public class E {
	public static void main(String[] args) {
		int i=10;
		int j= ++i +i+ i++ + ++i + i++; // pre & post-increment (both mixed)
	 	//     11  11   11    13    13
		System.out.println(i);//14
		System.out.println(j);//11+11+11+13+13=59
		}	
	}
