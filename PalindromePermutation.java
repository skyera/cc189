// 1.4 Palindrome permutation
// 9/7/2017
public class PalindromePermutation {
    int getCharNumber(Character c) {
        int a = Character.getNumericValue('a');
        int z = Character.getNumericValue('z');
        int val = Character.getNumericValue(c);

        if (a <= val && val <= z)
            return val - a;
        else 
            return -1;
    }

    int[] buildCharFrequencyTable(String phrase) {
        int[] table = new int[Character.getNumericValue('z') - 
                              Character.getNumericValue('a') + 1];
        for (char c: phrase.toCharArray()) {
            int x = getCharNumber(c);
            if (x != -1)
                table[x]++;
        }
        return table;
    }

    boolean checkMaxOneOld(int[] table) {
        boolean foundOdd = false;
        for (int count: table) {
            if (count % 2 == 1) {
                if (foundOdd) return false;
                foundOdd = true;
            }
        }

        return true;
    }

    boolean isPermutationOfPalindrome(String phrase) {
        int[] table = buildCharFrequencyTable(phrase);
        return checkMaxOneOld(table);
    }

    public static void main(String[] args) {
    
    }
}
