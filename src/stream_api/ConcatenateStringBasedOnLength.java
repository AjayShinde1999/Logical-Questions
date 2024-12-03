package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConcatenateStringBasedOnLength {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Ajay", "Rohan", "Ganesha", "Om", "Ram");

        String collect = list.stream().filter(name -> name.length() > 3).collect(Collectors.joining(", "));
        System.out.println(collect);
    }
}
