import java.util.Scanner;
class LeapOrNot {
    void leap() {
        int year,
        c=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the year");
        year = scan.nextInt();
        if (year % 400 == 0) {
            c = 1;
        } else if (year % 100 != 0) {
            if (year % 4 == 0)
                c = 1;
        }
        if (c == 1) {
            System.out.println("the year is a leap year");
        } else {
            System.out.println("not a leap year");
        }
    }
    public static void main(String...s) {
        LeapOrNot y1 = new LeapOrNot();
        y1.leap();
    }
}
