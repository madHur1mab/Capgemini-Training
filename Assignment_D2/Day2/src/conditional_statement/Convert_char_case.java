package conditional_statement;

public class Convert_char_case {
	public static void main(String[] args) {
		char c = 'F';
		if (c >= 'A' && c <= 'Z') {
            c = (char) (c + 32);
            System.out.println("Converted character: " + c);
        }
        else if (c >= 'a' && c <= 'z') {
            c = (char) (c - 32);
            System.out.println("Converted character: " + c);
        }
        else {
            System.out.println("Not an alphabet character");
        }
	}
}
