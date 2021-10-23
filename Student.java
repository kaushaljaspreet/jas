class Student{
String name;
long phNo;
String college;
String city;
void setName(String name){
this.name=name;

}
void setphNo(long phNo){
this.phNo=phNo;

}
void setCollege(String college){
this.college=college;

}
void setCity(String city){
this.city=city;

}
public static void main(String...s){
Student s1=new Student();
s1.setName("Ram");
s1.setphNo(96543);
s1.setCollege("JMIT");
s1.setCity("Yamunanagar");
s1.printData();
}
void printData()
{
System.out.println(name + "," +phNo + "," + college +"," + city); 
}
}