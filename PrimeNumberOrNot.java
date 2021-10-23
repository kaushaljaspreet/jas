import java.util.Scanner;
class PrimeNumberOrNot {
    public static void main(String...s) {
        int number;
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        //primeNumber(number);
        if (primeNumber(number) == true) {
           System.out.println("prime number");

        } else
            System.out.println("not prime number");
getPrimeNumber(number);
    }
	
	static void getPrimeNumber(int b)
	{ int i=2;
	System.out.println("All prime number till "+ b);
		for(i=2;i<=b;i++)
		{if(primeNumber(i)==true)
			{
				System.out.println(i);
			}
		}
			
	}
    static boolean primeNumber(int a) {

        if (a <= 1) {
            return false;
        }

        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                return false;
            }

        }
        return true;

    }

}
