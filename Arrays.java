package week2day1;

public class Arrays {
	public static void main(String[] args) {
		
		int a1[] = new int[5];
		int []a2 = {1,2,3,4,5};
		
		int a3[][] = new int[4][5];
		int a4[][] = {
				{1,2,3,4,5},
				{10,20,30,40,50}
		};
		int a5[][] = new int[3][];
		
		int a6[][] = {
				{1,2,3,4,5},
				{10,20,30,40,50,60,70}
		};
		
		for(int a[]:a6)
			for(int i:a)
				System.out.println(i);
		
	}
}
