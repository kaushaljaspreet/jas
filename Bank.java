import java.util.Scanner;
class Bank {
	public static void main(String...s)
	{Bank b=new Bank();
		b.showMenu();
	}
    void showMenu() {

        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        System.out.println("What you would like to do");
        System.out.println("A: Check your Balance");
    }
}