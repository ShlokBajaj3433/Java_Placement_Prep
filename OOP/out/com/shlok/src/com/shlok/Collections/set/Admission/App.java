package com.shlok.Collections.set.Admission;

public class App {
    public static void main(String[] args) {
        
        AdmissionSystem system = new AdmissionSystem();

        System.out.println("--- Initial State ---");
        System.out.println("Is admission list empty? " + system.isAdmissionEmpty());

        // 1. Create Student Objects

          Student arr[] = { 
                new Student(101, "Shlok", "Shlok@gmail.com", "B.TECH"),
                new Student(102, "Shlok Kumar", "SHLOK@gmail.com", "MBA"),
                new Student(104, "Pankaj", "PANKAJ@gmail.com", "BCA"),
                new Student(107, "keshvi", "KeShvI@gmail.com", "MCA")
        };

        Student s1 = new Student();
        s1.setStdId(1);
        s1.setStdName("Shlok");
        s1.setStdEmail("shlok@gmail.com");
        s1.setCource("Computer Science");

        Student s2 = new Student();
        s2.setStdId(2);
        s2.setStdName("SHlOk");
        s2.setStdEmail("SHlOk@email.com");
        s2.setCource("Information Technology");


        // 2. Test Single Registration
        System.out.println("\n--- Registering Students ---");
        system.registerStudent(s1);
        system.registerStudent(s1);
        system.registerStudent(s2);
        
        // Edge Case: Try to register a duplicate email
        System.out.println("\nTrying duplicate registration:");
        system.registerStudent(s1); 

        // 3. Test Multiple Registration
        System.out.println("\n--- Registering Multiple Students ---");
        
        system.registerMultipleStudents(arr);

        // 4. Display and Count
        System.out.println("\n--- System Status ---");
        System.out.println("Total Registered Students: " + system.getTotalCount());
        system.displayAllStudents();

        // 5. Searching
        System.out.println("\n--- Search Operations ---");
        
        System.out.println("Searching by Email (Shlok@email.com):");
        system.searchStudent("Shlok@email.com");

        System.out.println("\nSearching by ID (107):");
        Student foundById = system.findStudentById(3);
        if (foundById != null) {
            System.out.println("Found: " + foundById.getStdName() + " in course " + foundById.getCource());
        }

        System.out.println("\nSearching by Name (Charlie):");
        Student foundByName = system.findStudentByName("Charlie");
        if (foundByName != null) {
            System.out.println("Found: " + foundByName.getStdName() + " with email " + foundByName.getStdEmail());
        }

        // 6. Removing a Student
        System.out.println("\n--- Remove Operations ---");
        system.removeStudent("KeShvI@gmail.com");
        System.out.println("Total after removal: " + system.getTotalCount());

        // 7. Clear All
        System.out.println("\n--- Clear System ---");
        system.clearAllAdmissions();
        System.out.println("Is admission list empty now? " + system.isAdmissionEmpty());
    }
}