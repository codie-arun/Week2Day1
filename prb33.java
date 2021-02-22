package week2day1;

public class prb33 {
	Background b = new Background();
	b.run();
}

class Background implements Runnable{
int i=0;
public int run(){
	while(true){
		i++;
		System.out.println("i="+i);
	} //End while
	return 1;
	}//End run
}//End class

// The code will cause an error at compile time.