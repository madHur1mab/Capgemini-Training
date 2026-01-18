package array_1D;import java.util.*;

public class ReoveElement {
	 public static int[] removeAtIndex(int[] arr, int index) {

	        int[] newArr = new int[arr.length - 1];

	        for (int i = 0; i < index; i++)
	            newArr[i] = arr[i];

	        for (int i = index + 1; i < arr.length; i++)
	            newArr[i - 1] = arr[i];

	        return newArr;
	    }

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        
	        System.out.println("Enter size of array: ");
	        int n = sc.nextInt();
	        int[] arr = new int[n];

	        for (int i = 0; i < n; i++)
	            arr[i] = sc.nextInt();

	        int index = sc.nextInt();

	        int[] result = removeAtIndex(arr, index);

	        for (int x : result)
	            System.out.print(x + " ");
	    }
}
