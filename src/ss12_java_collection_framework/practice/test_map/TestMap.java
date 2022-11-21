package ss12_java_collection_framework.practice.test_map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Hậu", 18);
        hashMap.put("Hùng", 27);
        hashMap.put("Ngọc Vũ", 27);
        hashMap.put("Đức Vũ", 31);

        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", value: " + entry.getValue());
        }

        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Display entries in ascending order of key ");

        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", value: " + entry.getValue());
        }

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Hậu", 18);
        linkedHashMap.put("Hùng", 27);
        linkedHashMap.put("Ngọc Vũ", 27);
        linkedHashMap.put("Đức Vũ", 31);

        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
            System.out.println("The age for: " + entry.getKey() + " is: " + entry.getValue());
        }
    }
}
