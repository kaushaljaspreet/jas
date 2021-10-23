import java.util.Scanner;
class PrimeOrNot {
    PrimeOrNot(int max) {
        int number;

        for (number = 2; number <= max; number++) {
            int flag = 0;
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    flag = 1;
                    break;

                }

            }
            if (flag == 0) {
                System.out.println(number);
            }
        }

    }

    public static void main(String...s) {
		
		try{

        Scanner scan = new Scanner(System.in);

        System.out.println("Please provide some input");

        int data = scan.nextInt();

        //int data=Integer.parseInt(s[0]);
        PrimeOrNot ob = new PrimeOrNot(data);
        System.out.println("Please provide some input at untime : " + ob);
		}
		catch(Exception e){
				System.out.println("Please provide int ");
		}

    }
	

}
