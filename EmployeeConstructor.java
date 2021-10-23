class EmployeeConstructor {
    int id;
    float salary;
    String name;
 static String company="IBM";
	EmployeeConstructor(int id, String name, float salary)
	{
		
	this.id=id;
		this.salary=salary;
		this.name=name;
		
	}
void dispaly()
{	
System.out.println(id+name+salary+company);
}	
    
	public static void main(String...s) {
	EmployeeConstructor e1= new EmployeeConstructor(12,"jas",3452);
		//Employee e1=new Employee();
		//e1.printEmployee(12,"jas",3452);
		//e1.company="DELL";
		//Employee e2=new Employee();
		//e2.printEmployee(13,"Man",6572);
		//Employee.printEmployee(12,"jas",3452, "IBM");
		e1.dispaly();
		
	}
}