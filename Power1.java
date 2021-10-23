import java.util.Scanner;
public class Power1 {
     public static void main(String...s) {
       int number, power;
	   Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        number = sc.nextInt();
        System.out.print("Enter the power : ");
        power = sc.nextInt(); 
        sc.close();
		
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

