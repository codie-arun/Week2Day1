package week2day1;

public class prb2 {

	public static void main(String arguments[]) {
		amethod(arguments);
	}

	public void amethod(String[] arguments) {
		System.out.println(arguments);
		System.out.println(arguments[1]);
		
	}
	
	
	//Cannot make a static reference to the non-static method amethod(String[])
}
