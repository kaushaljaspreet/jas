import java.util.Scanner;
class IsPalindrome {
    public static void main(String...s) {
        int num;
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        
        if (num == palindrome(num)) {
            System.out.println("number is palindrome");

        } else {
            System.out.println("Not Palindrome");
        }
    }
    static int palindrome(int a) {

        int temp;
        int sum = 0;
        while (a != 0) {
            temp = a % 10;
            sum = (sum * 10) + temp;
            a = a / 10;
        }
        return sum;
    }
}
