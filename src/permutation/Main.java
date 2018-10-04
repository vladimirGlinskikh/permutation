package permutation;

public class Main {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        String word = "algorithm";
        permutation(word);
        long end = System.currentTimeMillis();
        long timeConsumed = end - start;
        System.out.println(timeConsumed);
    }

    public static void permutation(String string) {
        permutation("", string);
    }

    public static void permutation(String prefix, String string) {
        int n = string.length();
        if (n == 0)
            System.out.println(prefix);
        else {
            for (int i = 0; i < n; i++) {
                permutation(prefix + string.charAt(i),
                        string.substring(0, i) +
                                string.substring(i + 1, n));
            }
        }
    }
}
