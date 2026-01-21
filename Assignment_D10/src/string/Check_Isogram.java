package string;
import java.util.Arrays;

public class Check_Isogram {
	public static boolean isIsogram(String s) {

        s = s.toLowerCase();
        char[] arr = s.toCharArray();
        Arrays.sort(arr);

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                return false;
            }
        }
        return true;
    }
	public static void main(String[] args) {
		System.out.println(isIsogram("Machine"));
	}
}
