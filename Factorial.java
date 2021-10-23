import java.util.Scanner;
class Factorial {
    public static void main(String...s) {
        System.out.println("Enter the Number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Factorial f1 = new Factorial();
         System.out.println("Factorial of " + num + " is = " + f1.factorial(num));
    }
    //void factorial(int a) {
    //  int fact = 1;
    //    for (int i = 1; i <= a; i++) {
    //      fact = fact * i;
    //}
    //System.out.println ("Factorial of " + a + " is = " + fact);
    //}
    int factorial(int a) {
        int fact = 1;
        if (a == 0) {
            return 1;
        } else {
            fact= a * factorial(a - 1);
           
        }
		return fact;

    }

}
