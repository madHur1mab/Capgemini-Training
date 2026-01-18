package array_1D;
import java.util.*;

public class FirstLastElement {
	 public static void printFirstLast(int[] arr) {
	        System.out.println("First Element: " + arr[0]);
	        System.out.println("Last Element: " + arr[arr.length - 1]);
	    }

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        
	        System.out.println("Enter size of array: ");
	        int n = sc.nextInt();
	        int[] arr = new int[n];

	        for (int i = 0; i < n; i++)
	            arr[i] = sc.nextInt();

	        printFirstLast(arr);
	    }
}
