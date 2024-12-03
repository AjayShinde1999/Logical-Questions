package normal_logic;

public class PalindromeString {
    public static void main(String[] args) {
        String str = "MADAM";
        boolean result = checkPalindrome(str);
        if (!result) {
            System.out.println("Not Palindrome");
        } else {
            System.out.println("Palindrome");
        }
    }

    public static boolean checkPalindrome(String name) {
        char[] chars = name.toCharArray();
        int sp = 0;
        int ep = name.length() - 1;

        while (sp < ep) {
            if (chars[sp] != chars[ep]) {
                return false;
            } else {
                sp++;
                ep--;
            }
        }
        return true;

    }
}
