class PrintSeq{
	static final int a;
	
	
PrintSeq(int a){
	
System.out.println("Constructor method");}
static{
	this.a=100;
	System.out.println("a ="+a);
	a=170;
System.out.println("Static block");}




public static void main(String...s){
PrintSeq ob=new PrintSeq(3);
//ob.a=3;
System.out.println("Main method");


} 


}