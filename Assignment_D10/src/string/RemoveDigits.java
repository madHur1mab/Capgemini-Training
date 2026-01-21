package string;

public class RemoveDigits {
	public static String removeDigits(String s) {
        return s.replaceAll("[0-9]", "");
    }
	
	public static void main(String[] args) {
		System.out.println(removeDigits("a1b2c3"));
	}
}
