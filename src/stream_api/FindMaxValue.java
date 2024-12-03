package stream_api;

import java.util.Arrays;
import java.util.List;

public class FindMaxValue {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 3, 4, 1, 8, 10, 5);

        int max = list.stream().mapToInt(Integer::intValue).max().getAsInt();
        System.out.println(max);


        Integer maxValue = list.stream().reduce(Integer::max).get();
        System.out.println(maxValue);

        Integer max1 = list.stream().reduce((a, b) -> a > b ? a : b).get();
        System.out.println(max1);
    }
}
