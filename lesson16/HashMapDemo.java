package com.company.lesson16;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<String, Toy> map = new HashMap<>();
        map.put("Kukla", new Toy("Kukla", 34));
        map.put("Car", new Toy("Car", 54));
        map.put("Kubic", new Toy("Kubic", 64));

        System.out.println(map.get("Car"));

        enumerateValues(map);

        collectionValues(map);

        Set<Map.Entry<String, Toy>> set = map.entrySet();
        for (Map.Entry<String, Toy> entry : set) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }


    private static void collectionValues(Map<String, Toy> map) {
        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key);
            System.out.println(map.get(key));
        }
    }

    private static void enumerateValues(Map<String, Toy> map) {
        Collection<Toy> values = map.values();
        System.out.println(values);
    }
}
