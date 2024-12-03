package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectAllStringsWithCertainLength {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Ajay", "Rohan", "Vinayak", "Ganesha", "Abhi", "Ram", "Om");

        List<String> collect = list.stream().filter(name -> name.length() > 3).collect(Collectors.toList());
        System.out.println(collect);

    }
}
