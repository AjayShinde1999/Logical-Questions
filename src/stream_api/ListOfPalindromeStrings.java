package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ListOfPalindromeStrings {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("MADAM", "ARRA", "RAM", "Ajay");

        // approach 1 using functional interface
        Predicate<String> checkPalindrome = (String str) -> {
            String st = str.toLowerCase();
            String reverse = new StringBuilder(st).reverse().toString();
            return st.equals(reverse);
        };
        List<String> collect1 = list.stream().filter(checkPalindrome).collect(Collectors.toList());
        System.out.println(collect1);


        // approach 2
        List<String> collect = list.stream().filter(str -> isPalindrome(str)).collect(Collectors.toList());
        System.out.println(collect);
    }

    public static boolean isPalindrome(String str) {
        String st = str.toLowerCase();
        String reverse = new StringBuilder(st).reverse().toString();
        return st.equals(reverse);
    }
}
