// replace space with %20
// CC 1.3
// 9/7/2017
public class URLify {
    public static void replaceSpaces(char[] str, int trueLength) {
        int spaceCount = 0, index, i = 0;
        for (i = 0; i < trueLength; i++) {
            if (str[i] == ' ')
                spaceCount++;
        }

        index = trueLength + spaceCount * 2;
        if (trueLength < str.length)
            str[trueLength] = '\0';
        
        for (i = trueLength - 1; i >= 0; i--) {
            if (str[i] == ' ') {
                str[index-1] = '0';
                str[index-2] = '2';
                str[index-3] = '%';
                index = index - 3;
            } else {
                str[index-1] = str[i];
                index--;
            }
        }
    }
    
    public static void main(String[] args)
    {
        String s = "Mr John Smith    ";
        char[] a = new char[100];
        for (int i = 0; i < s.length(); i++)
            a[i] = s.charAt(i);

        replaceSpaces(a, 13);
        for (int i = 0; i < 20; i++) 
            System.out.println(a[i]);
    }
}
