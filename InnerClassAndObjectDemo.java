package week2day1;

public class InnerClassAndObjectDemo {
	
	public static void main(String[] args) {
		Pepsi pepsico=new Pepsi();
		Kalimark annachi=new Kalimark();
		
		pepsico.makePepsiCola();
		annachi.makeKalimarkCola();
	}
	
}


abstract class Cola{
	public abstract void makeCola();
}



class Kalimark{
	
	int money;
	
	public void makeKalimarkCola{
		new Cola() {
			
			@Override
			public void makeCola() {
				// TODO Auto-generated method stub
				System.out.println("Cola now belongs to Kalimark");
			}
		}.makeCola();
	}
	
//	public void makeKalimarkCola() {
//		
//		class CampaCola extends Cola{
//			
//			@Override
//			public void makeCola() {
//				
//				System.out.println("cola made by campa cola...."+money);
//			}
//			
//		}
//		
//		Cola cola = new CampaCola();
//		cola.makeCola();
//		
//		System.out.println("Kalimark sells the campa cola in Kalimark bottle....\"");
	
	
	
}
	
//	public Cola getColaTrojan() {
//		return new CampaCola();
//	}
	
//}

class Pepsi{
	public void makePepsiCola() {
		//Cola cola = new Kalimark().getColaTrojan();
		//Cola cola = new Kalimark().new CampaCola();
		new Kalimark().makeKalimarkCola();
		cola.makeCola();
		
		System.out.println("pepsi sells the campa cola in pepsi bottle....\"");
	}
}