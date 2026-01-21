package string;

public class SpecialSymbol {
	public static void findSpecialSymbols(String s) {

        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (!Character.isLetterOrDigit(c) && c != ' ') {
                sb.append(c).append(" ");
            }
        }

        System.out.println("Special Symbols: " + sb.toString().trim());
    }
	public static void main(String[] args) {
		findSpecialSymbols("Hello@#2024!");
	}
}
