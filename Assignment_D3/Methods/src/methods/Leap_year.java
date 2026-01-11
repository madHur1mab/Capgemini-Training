package methods;
import java.util.*;

public class Leap_year {
	
	public static boolean check_leap_year(int year) {
		if(year % 400 == 0 || (year % 100 != 0 && year%4 == 0)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a year: ");
		int year = sc.nextInt();
		
		boolean res = check_leap_year(year);
		if(res == true) {
			System.out.println("Leap year");
		}
		else {
			System.out.println("Not leap year");
		}
	}
}
