package methods;
import java.util.*;

public class count_digits {
	
	public static boolean count_even_odd_digits(int num) {
		int count_even = 0;
		int count_odd = 0;
		int rem;
		while(num>0) {
			rem = num%10;
			if(rem%2==0) {
				count_even++;
				}
			else {
				count_odd++;
			}
			num=num/10;
		}
		if(count_even==count_odd) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		
		boolean res = count_even_odd_digits(n);
		System.out.println(res);
		}
}
