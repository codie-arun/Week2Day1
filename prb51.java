package week2day1;


public class prb51{
private int i;
public static void main(String argv[]){
	prb51 s = new prb51();
	s.amethod();
	}//End of main
public static void amethod(){
	System.out.println(i);
	}//end of amethod
}//End of class	


// A compile time error - Cannot make a static reference to the non-static field i
