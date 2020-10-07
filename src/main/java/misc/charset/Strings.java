package misc.charset;

public class Strings {

    public static void main(String[] args) {
        System.out.println(concatenate("a","b"));
    }

    static String concatenate(String s1, String s2) {
        int resultStrLength = s1.length() + s2.length();
        char[] resultStr = new char[resultStrLength];
        for (int i = 0; i < s1.length(); i++)
            resultStr[i] = s1.charAt(i);
        for (int i = s1.length(); i < resultStrLength; i++)
            resultStr[i] = s2.charAt(i - s1.length());
        return new String(resultStr);
    }
}