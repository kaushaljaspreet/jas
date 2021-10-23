class Scholarship{

void setDetails (String name, int marks){

printData(name,marks);
} 
public static void main(String... s)
{
Scholarship ob=new Scholarship();
ob.setDetails("SHUBHAM", 1500);

ob.setDetails("Jaspreet", 1000);



}
void printData(String name, int marks)
{
System.out.println(name+","+marks);
eligibilityForScholarship(name,marks);
}
void eligibilityForScholarship(String name, int marks)
{
	switch(marks)
	{
	case 500:
	System.out.println(name+" Eligible for 1000 scholarship");
	break;
	case 1000:
	System.out.println(name+" Eligible for 1500 scholarship");
	break;
	case 1500:
	System.out.println(name+" Eligible for 2000 scholarship");
	break;
	case 2000:
	System.out.println(name+" Eligible for 2500 scholarship");
	break;
	default:
	System.out.println("Invalid");
	
	
	}
	
}


}