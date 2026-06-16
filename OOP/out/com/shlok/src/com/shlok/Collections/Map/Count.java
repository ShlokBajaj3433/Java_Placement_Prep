package com.shlok.Collections.Map;

import java.util.HashMap;
import java.util.Map;

public class Count {
    public static void main(String[] args) {
        int[] arr = {2,5,1,6,2,5,1,6,8,1,1};

    Map<Integer, Integer> countMap = new HashMap<>();

    for (int num : arr) {
        if (countMap.containsKey(num)) {
        countMap.put(num, countMap.get(num) + 1);
        } else {
        countMap.put(num, 1);
        }
    }

        System.out.println(countMap+ " ");
    }
}
