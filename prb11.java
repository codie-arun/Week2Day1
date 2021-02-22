package week2day1;



abstract class MineBase {
	abstract void amethod();
	static int i;
}

public class prb11 extends MineBase {
	public static void main(String argv[]){
		int[] ar=new int[5];
		for(i=0;i < ar.length;i++)
			System.out.println(ar[i]);
	}
}

// a sequence of 5 0's will be printed