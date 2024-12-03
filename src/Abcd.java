public class Abcd {
    public static void main(String[] args) {
        String s = "abcabcabbcd";
        String[] arr = {"Ajay","Ajjaskjha","aljajd"};
        longestSubStringWithRepeating(s);
    }

    public static void longestSubStringWithRepeating(String str) {
//        char[] ch = str.toCharArray();
        String finalSub = "";
        for (int i = 0; i < str.length(); i++) {
            String sub = "";
            for (int j = i; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j) && i != j) {
                    break;
                }

                sub = sub + str.charAt(j);

                System.out.println(sub);
            }

            if (sub.length() > finalSub.length()) {
                finalSub = sub;
            }
        }

        System.out.println("Final :" + finalSub);

    }
}
