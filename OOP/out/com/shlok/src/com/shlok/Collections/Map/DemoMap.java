package com.shlok.Collections.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class DemoMap {
    public static void main(String[] args) {
        Map<Integer,String> employee = new HashMap<>();
        employee.put(101, "Shl");
        employee.put(104, "swa");
        employee.put(100, "suc");
        employee.put(3, "theree");

        // System.out.println(employee);
        // System.out.println(employee.get(3));
        // System.out.println(employee.getOrDefault(3, "User not found"));

        for (Map.Entry<Integer, String> entry : employee.entrySet()) {
            System.out.println(entry);
        }

        // for (Integer i : employee.keySet()) {
        // System.out.println(employee.get(i));
        // }



        // Map<Integer,String> Studnet = new HashMap<>();
        // Studnet.put(101, "Shl");
        // Studnet.put(104, "swa");
        // Studnet.put(100, "suc");
        // Studnet.put(3, "theree");

        // System.out.println(Studnet);

        // Map<Integer,String> product = new TreeMap<>();

        // product.put(null, null);
    }
}
