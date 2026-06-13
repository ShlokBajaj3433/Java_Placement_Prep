package com.shlok.Collections.set;

import java.util.*;

public class SetDemo {
    public static void main(String[] args) {
        
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(2); // Duplicate, won't be added

        System.out.println("Set contains 2: " + set.contains(2)); // true
        System.out.println("Set size: " + set.size()); // 3

        set.remove(2);
        System.out.println("Set contains 2 after removal: " + set.contains(2)); // false
        System.out.println("Set size after removal: " + set.size()); // 2

        System.out.println(set);
        
        Set<Integer> set2 = new LinkedHashSet<>();
        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(2);
        System.out.println(set2);
        
        Set<Integer> set3 = new TreeSet<>();
        set3.add(1);
        set3.add(2);
        set3.add(3);
        set3.add(2);
        System.out.println(set3);



    }
}
