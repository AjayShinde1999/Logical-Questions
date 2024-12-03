package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListOfDistinctSquare {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 3, 4, 5, 5, 6);

        List<Integer> collect = list.stream().map(n -> n * n).distinct().collect(Collectors.toList());
        System.out.println(collect);
    }
}
