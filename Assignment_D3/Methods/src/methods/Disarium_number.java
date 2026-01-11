package methods;

import java.util.Scanner;

public class Disarium_number {
	
	public static int power(int b, int p) {
		int res = 1;
		while(p>0) {
			res = res*b;
			p--;
		}
		return res;
		
	}
	
	public static int count(int n) {
		int c = 0;
		while(n!=0) {
			int rem = n%10;
			c++;
			n = n/10;
		}
		return c;
	}
	
	public static String check_disarium(int num) {
		int temp = num;
	    int sum = 0;
	    int pos = count(num); 

	    while (temp != 0) {
	        int digit = temp % 10;
	        sum = sum + power(digit, pos);
	        pos--;
	        temp = temp / 10;
	    }

	    if (sum == num)
	        return "Disarium Number";
	    else
	        return "Not a Disarium Number";
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		
		System.out.println(check_disarium(n));
	}
}
