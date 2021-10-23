class A
{
A(int a)
{
	
System.out.println("Hello");
}
}
class B extends A
{
B()
{
super(5);	
System.out.println("b");
}
public static void main(String...s)
{
B b1=new B();

}
}