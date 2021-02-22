package week2day1;



class Base{
private void amethod(int iBase){
System.out.println("Base.amethod");
}
}
class prb59 extends Base{
public static void main(String argv[]){
prb59 o = new prb59();
int iBase=0;
o.amethod(iBase);
}
public void amethod(int iOver){
System.out.println("Over.amethod");
}
}

// Output of "Over.amethod"