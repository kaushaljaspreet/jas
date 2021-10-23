import java.util.Scanner;
class GreatestNumber{
	public static void main(String...s)
	{
		int a, b, c;
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		a=sc.nextInt();
		System.out.println("Enter the Second number");
		b=sc.nextInt();
		System.out.println("Enter the Third number");
		c=sc.nextInt();
		if(a>b)
		{if(a>c)
			{
				System.out.println("a is the greatest");
			}
		}
		else if(b>c)
		{
			System.out.println("b is the greatest");
		}
		else{
			System.out.println("c is the greatest");
		}
	}
	
}