package week2day1;




public class prb45{
public static void main(String argv[]){
	prb45 r = new prb45();
r.amethod(r);
}
public void amethod(prb45 r){
int i=99;
multi(r);
System.out.println(i);
}
public void multi(prb45 r){
r.i = r.i*2;
}
}

// Error at compile time - Unresolved compilation problems