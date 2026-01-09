package looping_statements;

public class Number_of_digits {
	public static void main(String[] args) {
		int n = 1234;
		int c = 0;
		
		while(n != 0) {
			int rem = n % 10;
			n = n / 10;
			c++;
		}
		System.out.println(c);
	}
}
