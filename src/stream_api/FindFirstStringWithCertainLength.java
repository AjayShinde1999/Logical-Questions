package stream_api;

import java.util.Arrays;
import java.util.List;

public class FindFirstStringWithCertainLength {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("AJay", "Rohan", "Avinash", "Vinayak");
        String first = list.stream().filter(name -> name.length() > 5).findFirst().get();
        System.out.println(first);
    }
}
