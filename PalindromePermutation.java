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

    // Solution 2
    boolean isPermutationOfPalindrome2(String phrase) {
        int countOdd = 0;
        int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];

        for (char c: phrase.toCharArray()) {
            int x = getCharNumber(c);
            if (x != -1) {
                table[x]++;
                if (table[x] % 2 == 1)
                    countOdd++;
                else
                    countOdd--;
            }
        }

        return countOdd <= 1;
    }

    // Solution 3
    boolean isPermutationOfPalindrome3(String phrase) {
        int bitVector = createBitVector(phrase);
        return bitVector == 0 || checkExactlyOneBitSet(bitVector);
    }

    int createBitVector(String phrase) {
        int bitVector = 0;
        for (char c: phrase.toCharArray()) {
            int x = getCharNumber(c);
            bitVector = toggle(bitVector, x);
        }
        return bitVector;
    }

    int toggle(int bitVector, int index) {
        if (index < 0) return bitVector;

        int mask = 1 << index;
        if ((bitVector & mask) == 0) { 
            // bit is 0, change it to 1
            bitVector |= mask;
        } else {
            // bit is 1, change it to 0
            bitVector &= ~mask;
        }
        return bitVector;
    }

    boolean checkExactlyOneBitSet(int bitVector) {
        return (bitVector & (bitVector - 1)) == 0;
    }

    public static void main(String[] args) {
    
    }
}
