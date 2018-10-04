import java.util.ArrayList;

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

    static ArrayList<String> permutation(String string) {
        if (string.length() == 1) {
            ArrayList<String> vector = new ArrayList<>();
            vector.add(string);
            return vector;
        }
        char startWord = string.charAt(0);
        ArrayList<String> endWord = permutation(string.substring(1));
        ArrayList<String> newEndWord = new ArrayList<>();
        for (String endW : endWord) {
            for (int i = 0; i <= endW.length(); i++) {
                if (endW.substring(0, i).endsWith(String.valueOf(startWord)))
                    break;
                newEndWord.add(endW.substring(0, i) + String.valueOf(startWord) +
                        endW.substring(i));

            }
        }
        return newEndWord;
    }
}
