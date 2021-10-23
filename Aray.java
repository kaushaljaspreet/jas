class Aray{

void getArray(int[] data)

{
	
		System.out.println(""+data.toString());
	
	data[0]=data[0]+1;
	for(int i=0;i<=8;i++){
	System.out.print(""+data[i]);
	}
}
public static void main(String...s){
	
	int[] a={1,2,3,4,5,6,7,8,9};
	Aray ob=new Aray();
		System.out.println(""+a.toString());
	ob.getArray(a);
		System.out.println(""+a.toString());
	System.out.println("Main Method");
	for(int i=0;i<=8;i++)
	{
	System.out.print(a[i]+"");
	}
	
}

}