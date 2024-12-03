package stream_api;

import java.util.Arrays;
import java.util.List;

public class FindAverageValue {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        double avg = list.stream().mapToInt(Integer::intValue).average().getAsDouble();
        System.out.println(avg);
    }
}
