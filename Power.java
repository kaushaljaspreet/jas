import java.util.Scanner;
public class Power {
    public static void main(String...s) {
       int number, power;
	   Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        number = scan.nextInt();
        System.out.print("Enter the power : ");
        power = scan.nextInt(); 
		
        long result = 1;
		int i=power;
        
        while (i != 0)
        {
            result = result*number;
            i--;
        }
        System.out.println(number+"^"+power+" = "+result);
    }
}