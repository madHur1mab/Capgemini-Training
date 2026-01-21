package string;

public class MaxVowels {
	public static String maxVowelWord(String s) {

        String[] words = s.split(" ");
        int maxCount = 0;
        String result = "";

        for (String word : words) {
            int count = 0;
            for (char c : word.toCharArray()) {
                if ("aeiouAEIOU".indexOf(c) != -1) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                result = word;
            }
        }
        return result;
    }
	public static void main(String[] args) {
		System.out.println(maxVowelWord("I love programming"));
	}
}
