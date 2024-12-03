package stream_api;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondLargestNumber {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 4, 3, 2, 5, 8, 10, 7);

        Integer secondMax = list.stream().sorted((a, b) -> b - a).skip(1).findFirst().get();
        System.out.println(secondMax);

        Integer secondLargest = list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(secondLargest);
    }
}
