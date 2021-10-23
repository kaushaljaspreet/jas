import java.util.Scanner;
import java.util.Arrays;
class ReverseOfArray{
    public static void main(String...s) {
        System.out.println("enter the total number of elements of an array");
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int array[] = new int[count];
		int b[] = new int[count];
		int i;
        System.out.println("enter the elements of an array");
        for (i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("original array is: "+ Arrays.toString(array));
		
			  System.out.println("array length is"+array.length);
       int j=array.length-1;
          for (i = 0; i <=array.length-1; i++) {
            b[j] = array[i];
			System.out.println(i +"   "+array[i]+"    "+b[j]);
			j=j-1;
			
			  
        } 
			  		//System.out.println(array[j]);
		 System.out.println("Reversed array is: "+ Arrays.toString(b));
         

    }
}