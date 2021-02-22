package week2day1;



public class prb35{
public static void main(String argv[]){
	prb35 c=new prb35();
	String s=new String("ello");
	c.amethod(s);
}
public void amethod(String s){
char c='H';
c = c+s;
System.out.println(c);
}
}

// Compile time error ,Type mismatch: cannot convert from String to char