package conditional_operator;

public class SingleOrDouble_digit {
	public static void main(String[] args) {
		int num = 24;
		int temp = (num < 0) ? -num : num;

        String res = (temp < 10)? "Single digit number": (temp < 100)? "Double digit number":"None";

        System.out.println(res);
	}
}
