import java.util.List;

public class vowel {
    public static void main(String[] args) {
        String vowel = "leetcode leetcode";
        char[] vowelChars = vowel.toCharArray();
        int Start = 0;
        int End = vowelChars.length - 1;
        while (Start < End) {
            while (Start<End&&!isvowel(vowelChars[Start])) {
                Start++;
            }
            while (Start<End&&!isvowel(vowelChars[End])) {
                End--;
            }
            if (Start<End) {
                char temp = vowelChars[Start];
                vowelChars[Start] = vowelChars[End];
                vowelChars[End] = temp;
                Start++;
                End--;
            }

        }
        for (char vowelChar : vowelChars) {
            System.out.print(vowelChar);
        }

    }
    public static boolean isvowel(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o'|| c == 'u') {
            return true;
        }
        else return false;
        }
}
