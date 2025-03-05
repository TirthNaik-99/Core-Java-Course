package org.example;

import com.sun.source.tree.Tree;

import java.util.*;

public class MapAndSet {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Tirth", 1);
        map.put("Siddhu", 2);
        map.put("Gopal", 3);
        map.put("Jyothi", 4);
        for(String key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }

        Set<String> names = new TreeSet<>();
        names.add("John");
        names.add("Jane");
        names.add("Bob");
        names.add("Jack");
        System.out.println(names);

        Iterator<String> iterator = names.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }

}
