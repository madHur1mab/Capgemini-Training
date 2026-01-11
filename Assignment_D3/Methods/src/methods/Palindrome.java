package methods;

import java.util.Scanner;

public class Palindrome {
	
	public static String check_palindrome(int num) {
		int original = num;
        int rev = 0;
        int rem;
        
        while (num > 0) {
            rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }

        if (original == rev) {
            return "good";
        } else {
        	return "bad";
        }
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		
		System.out.println(check_palindrome(n));
	}
}
