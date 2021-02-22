package week2day1;



public class prb41{
static int j=20;
public static void main(String argv[]){
int i=10;
prb41 p = new prb41();
p.amethod(i);
System.out.println(i);
System.out.println(j);
}
public void amethod(int x){
x=x*2;
j=j*2;
}
}

// 10 and 40

//prb 42. for(int i=0; i< ia.length;i++)