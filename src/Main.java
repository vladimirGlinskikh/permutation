import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        for (String string : permutation("algorithm")) {
            System.out.println(string);
        }
        long end = System.currentTimeMillis();
        long timeConsumed = end - start;
        System.out.println(timeConsumed);
    }

    static List<String> permutation(String string) {
        if (string.length() == 1) {
            List<String> list = new ArrayList<>();
            list.add(string);
            return list;
        }
        char startWord = string.charAt(0);
        List<String> endWord = permutation(string.substring(1));
        List<String> newEndWord = new ArrayList<>();
        for (String s : endWord) {
            for (int i = 0; i <= s.length(); i++) {
                if (s.substring(0, i).endsWith(String.valueOf(startWord)))
                    break;
                newEndWord.add(s.substring(0, i) + String.valueOf(startWord) +
                        s.substring(i));
            }
        }
        return newEndWord;
    }
}
