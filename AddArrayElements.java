import java.util.Arrays;
import java.util.Scanner;
class AddArrayElements {
    public static void main(String...s) { {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the length of the array");
            int length = sc.nextInt();
            int[]array = new int[length];
            System.out.println("Enter the elements of the array:");

            for (int i = 0; i < length; i++) {
                array[i] = sc.nextInt();
            }
 System.out.println("Entered Array is:");
            System.out.println(Arrays.toString(array));
            int result = 0;
            for (int i = 0; i < length; i++) {
                result = result + array[i];

            }
            System.out.println("Sum of all elements of array is: " + result);
			double average=(result/array.length);
			 System.out.println("average is:" + average);
        }
    }
}