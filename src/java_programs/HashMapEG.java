package java_programs;

import java.util.HashMap;

public class HashMapEG {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(25, "Ajay");
        map.put(27, "Rohan");
        map.put(30, "Mohan");
        map.put(39, "Arun");


        map.entrySet().stream().forEach(m -> {
            System.out.println(m.getKey() + " : " + m.getValue());
        });
    }
}
