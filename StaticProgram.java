class StaticProgram{
	
	static int staticWord;
	int normalInt;
	
	void printdata(){
		
		System.out.println("Static : "+staticWord+" normal : "+normalInt);
	}
	
	
	public static void main(String...s){
		
		StaticProgram ob=new StaticProgram();
		ob.normalInt++;
		staticWord=staticWord+1;
		ob.printdata();
		
		
		StaticProgram ob1=new StaticProgram();
		ob1.printdata();
		
		
	}





}