// A string has all unique characters. p90
// 9/4/2017

public class UniqueChars {
    public static boolean isUniqueChars(String str) {
        if (str.length() > 128) return false;

        boolean[] char_set = new boolean[128];
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            
            if (char_set[val]) 
                return false;
            char_set[val] = true;
        }

        return true;
    }

    // use a bit vector(int)
    public static boolean isUniqueChars2(String str) {
        int checker = 0;

        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i) - 'a';
            if (checker & (1 << val) > 0)
                return false;
            checker |= (1 << val);
        }

        return true;
    }

    public static void main(String[] args) {
        String str = "abcd";

        boolean ok = UniqueChars.isUniqueChars(str);
        assert ok;

        str = "abac";
        ok = UniqueChars.isUniqueChars(str);
        assert !ok;
        System.out.println("OK");
    }
}

