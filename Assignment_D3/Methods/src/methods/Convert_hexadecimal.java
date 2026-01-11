package methods;

import java.util.Scanner;

public class Convert_hexadecimal {
	public static String decimal_to_hexadecimal(int num) {
		String hex = "";
	    int rem;

	    while (num > 0) {
	        rem = num % 16;

	        if (rem < 10)
	            hex = rem + hex;
	        else
	            hex = (char)(rem + 55) + hex;  

	        num = num / 16;
	    }

	    return hex;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a decimal number: ");
		int n = sc.nextInt();
		
		System.out.println(decimal_to_hexadecimal(n));
	}
}
