package collection_topics;

import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        // Create a TreeMap
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // Adding elements to TreeMap
        treeMap.put(3, "Three");
        treeMap.put(1, "One");
        treeMap.put(2, "Two");
        treeMap.put(5, "Five");
        treeMap.put(4, "Four");

        // Iterating through TreeMap (will be in sorted order)
        System.out.println("TreeMap elements in sorted order:");
        treeMap.forEach((key, value) -> System.out.println(key + ": " + value));

        // Demonstrating navigation methods
        System.out.println("\nLowest Key: " + treeMap.firstKey());
        System.out.println("Highest Key: " + treeMap.lastKey());
        System.out.println("Key just lower than 3: " + treeMap.lowerKey(3));
        System.out.println("Key just higher than 3: " + treeMap.higherKey(3));

        // Removing an element
        treeMap.remove(2);
        System.out.println("\nAfter removing key 2:");
        treeMap.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}

