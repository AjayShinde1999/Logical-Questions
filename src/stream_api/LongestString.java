package stream_api;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LongestString {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Ajay", "Rohan", "Ganesha", "Rahul", "Om");

        String longest = list.stream().max(Comparator.comparingInt(String::length)).get();
        System.out.println(longest);

        String longest2 = list.stream().reduce((s1, s2) -> s1.length() >= s2.length() ? s1 : s2).get();
        System.out.println(longest2);
    }
}
