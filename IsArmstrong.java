import java.util.Scanner;
class IsArmstrong {
    public static void main(String...s) {
        int num;
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
		//armstrong(num);
IsArmstrong ob1=new IsArmstrong();
ob1.armstrong(num);
    }
void armstrong(int a){
        int temp = a;
        int rem = 0;
        int cube = 0;
        while (a != 0) {
            rem = a % 10;
            a = a / 10;
            cube = cube + (rem * rem * rem);
        }
        if (cube == temp) {
            System.out.println("num is armstrong");
        } else {
            System.out.println("num is not armstrong");
        }
    }

}
