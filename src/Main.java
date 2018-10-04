import java.util.Vector;

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

    static Vector<String> permutation(String string) {
        if (string.length() == 1) {
            Vector<String> vector = new Vector<>();
            vector.add(string);
            return vector;
        }
        char startWord = string.charAt(0);
        Vector<String> endWord = permutation(string.substring(1));
        Vector<String> newEndWord = new Vector<>();
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
