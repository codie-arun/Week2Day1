package week2day1;

class Base {}
class Sub extends Base {}
class Sub2 extends Base {}



public class prb17 {
	public static void main(String argv[]){
		Base b=new Base();
		Sub s=(Sub) b;
	}
}


//Base cannot be cast to class week2day1.Sub 