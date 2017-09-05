// Check permutation: given two strings, write a method to decide if one is a permutation of the other.
// 9/5/2017
import java.util.*;

public class StringPermutation {
    private static String sort(String s) {
        char[] content = s.toCharArray();
        java.util.Arrays.sort(content);

        return new String(content);
    }

    public static boolean permutation(String s, String t) {
        if (s.length() != t.length()) return false;

        return sort(s).equals(sort(t));
    }

    public static boolean permutation2(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] letters = new int[128];
        for (int i = 0; i < s.length(); i++)
            letters[s.charAt(i)]++;

        for (int i = 0; i < t.length(); i++) {
            letters[t.charAt(i)]--;
            if (letters[t.charAt(i)] < 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        
    }
}
