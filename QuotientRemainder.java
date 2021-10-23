import java.util.Scanner;
class QuotientRemainder {
     void quoRem(){
        
int num1 , num2;
Scanner scan=new Scanner(System.in);
System.out.println("Enter the first number");
num1=scan.nextInt();
System.out.println("Enter the second number");
num2= scan.nextInt();
        int quotient = num1 / num2;
        int remainder = num1 % num2;
        System.out.println("Quotient is: " + quotient);
        System.out.println("Remainder is: " + remainder);
		
    }
	public static void main(String...s)
	{
		QuotientRemainder q1= new QuotientRemainder();
		q1.quoRem();
	}
}