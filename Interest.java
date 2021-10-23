class Interest{
String name;
double interest;
float time;
double amount;
float rate;
void getName(String name)
{
this.name=name;
}
void getAmount(double amount)
{
this.amount=amount;
}
void getTime(float time)
{
this.time=time;

}
void getRate(float rate)
{
this.rate=rate;
}
void printData(){
System.out.println(name+","+amount+","+ time+","+rate);
}
void totalInterest(){
	if (time>12)
{
	System.out.println("enter vaild time");
}
else
{
interest=(amount*rate*time)/100;
System.out.println(interest);
}
}
public static void main(String...s)
{
Interest ob=new Interest();
ob.getName("SBC");
ob.getAmount(10000);
ob.getTime(2);
ob.getRate(2);
ob.printData();
ob.totalInterest();
}

}
