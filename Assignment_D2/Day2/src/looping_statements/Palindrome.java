package looping_statements;

public class Palindrome {
	public static void main(String[] args) {
        int num = 121;
        int original = num;
        int rev = 0;
        int rem;
        
        while (num > 0) {
            rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }

        if (original == rev) {
            System.out.println("The number is a Palindrome");
        } else {
            System.out.println("The number is not a Palindrome");
        }
    }
}
