class Abc{
int salary;
String name;



void setDetails(int salary,String name){
	this.salary=salary;
	this.name=name;
System.out.println("this address"+this);

}


public static void main(String...s){


Abc ob=new Abc();
ob.setDetails(5000,"shubham");
System.out.println(ob.name+" "+ob.salary);
System.out.println("object address"+ob.toString());


}

}
