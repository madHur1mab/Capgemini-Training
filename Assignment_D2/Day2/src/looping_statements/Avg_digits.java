package looping_statements;

public class Avg_digits {
	public static void main(String[] args) {
		int n = 123;
		int sum = 0;
		int c = 0;
		
		while(n != 0) {
			int rem = n % 10;
			c++;
			sum = sum + rem;
			n = n / 10;
		}
		int avg = sum/c;
		System.out.println("Average of digits :" + avg);
	}
}
