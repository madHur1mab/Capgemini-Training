package looping_statements;

public class Odd_numbers {
	public static void main(String[] args) {
		int n1 = 1;
		int n2 = 10;
		while (n1 <= n2) {
            if (n1 % 2 != 0) {
                System.out.println(n1);
            }
            n1++;
        }
	}
}
