package com.shlok.Collections.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
         List<String> students = new ArrayList<>();

        students.add("pankaj");
        students.add("kaustubh");
        students.add("Swaraj");
        students.add("Shlok");
        students.add("Suchit");

        System.out.println(students);

        for (String st : students) {
            if (st == "pinki") {
                System.out.println("Element found ! ");
                System.out.println(students.indexOf("pinki"));

            }
        }

        students.add(3, "samrudhhi");

        System.out.println(students);

        System.out.println(students.get(3));

        System.out.println(students.set(0, "keshvi"));

        System.out.println(students);

        System.out.println(students.remove("Ramu"));

        System.out.println(students);

        System.out.println(students.contains("Chinkiiii"));

        System.out.println(students.size());

        // students.clear();

        System.out.println(students.isEmpty());

        Collections.sort(students);

        System.out.println(students);

        Collections.reverse(students);

        System.out.println(students);

        

    }
}
