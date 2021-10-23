class Employee {
    
    static String company="IBM";
	public static void printEmployee(int id1, String name1, float salary1)
	{
		int id;
    float salary;
    String name;
	id=id1;
		salary=salary1;
		name=name1;
		
		System.out.println(id+name+salary+company);
	}		
    
	public static void main(String...s) {
		Employee e1=new Employee();
		e1.printEmployee(12,"jas",3452);
		e1.company="DELL";
		Employee e2=new Employee();
		e2.printEmployee(13,"Man",6572);
		//Employee.printEmployee(12,"jas",3452, "IBM");
		
	}
}
