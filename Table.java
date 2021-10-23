class Table{
public static void tableOfTwo(int a)
{
for (int i=1; i<=10;i++)
{
	
System.out.println(a+" * "+i+"="+a*i);
}
}
public static void main(String...s){

Table.tableOfTwo(2);
Table.tableOfTwo(5);
}
}