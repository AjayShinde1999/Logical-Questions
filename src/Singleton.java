import java.util.HashSet;

public class Singleton {
    public static void main(String[] args) {
        String str = "abcdeabcabcd";
        System.out.println(longestRepeating(str));
    }

    public static String longestRepeating(String str1) {
        String longestTillNow = "";
        String longestOverall = "";
        HashSet<Character> set = new HashSet<>();

        for (int j = 0; j < str1.length(); j++) {
            for (int i = j; i < str1.length(); i++) {
                char c = str1.charAt(i);
                if (set.contains(c)) {
                    longestTillNow = "";
                    set.clear();
                    break;
                }

                longestTillNow = longestTillNow + c;
                set.add(c);

                if (longestTillNow.length() > longestOverall.length()) {
                    longestOverall = longestTillNow;
                }

            }
        }
        return longestOverall;
    }
}

