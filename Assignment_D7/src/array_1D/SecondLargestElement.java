package array_1D;
import java.util.*;
public class SecondLargestElement {
	 public static int findSecondLargest(int[] arr) {

	        int largest = arr[0];
	        int secondLargest = arr[0];

	        
	        for (int i = 1; i < arr.length; i++) {
	            if (arr[i] > largest) {
	                largest = arr[i];
	            }
	        }

	       
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] < largest) {
	                if (secondLargest == largest || arr[i] > secondLargest) {
	                    secondLargest = arr[i];
	                }
	            }
	        }

	        return secondLargest;
	    }
	 
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter array size: ");
	        int n = sc.nextInt();

	        int[] arr = new int[n];

	        System.out.println("Enter array elements:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }

	        System.out.println("Second largest element: " + findSecondLargest(arr));
	    }
}
