package week2day1;

public class ObjectArray {
	
	public static void main(String[] args) {
		
		Myobject o[][] = new Myobject[2][3];
		o[0][0] = new Myobject("first row first column");
		o[0][1] = new Myobject("first row second column");
		o[0][2] = new Myobject("first row third column");
		o[1][0] = new Myobject("second row first column");
		o[1][1] = new Myobject("second row second column");
		o[1][2] = new Myobject("second row third column");
		
		
		for(Myobject a[]:o)
			for(Myobject i:a)
				System.out.println(i);
		
	}	
}

class Myobject{
	
	static int i = 0;
	String msg;
	
	Myobject(String msg){
		this.msg = msg;
	}
	
	@Override
	public String toString()
	{
		i++;
		return i+" "+this.msg;
	}
	
}