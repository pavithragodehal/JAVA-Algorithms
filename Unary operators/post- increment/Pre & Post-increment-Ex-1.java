package app_2;

public class E {
	public static void main(String[] args) {
		int i=10;
		int j= ++i + i++; // pre & post-increment (both mixed)
		//      11    11
		System.out.println(i);//12
		System.out.println(j);//11+11=22
		}	
	}
