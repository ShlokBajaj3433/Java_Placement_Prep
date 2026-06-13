package com.shlok.Collections.set.Admission;

import java.util.HashSet;
import java.util.Set;

public class AdmissionSystem {
    
    Set<Student> students = new HashSet<>();

    // Register student
    void registerStudent(Student student) {
        if (student.getStdEmail() == null || student.getStdEmail().isEmpty()) {
            System.out.println("Not a valid email");
            return;
        }
        if (students.add(student)) {
            System.out.println("Registration successfull!!");
        } else {
            System.out.println("Duplicate email : " + student.getStdEmail() + ", please change it");
        }

    }

    // Register Multiple students

    void registerMultipleStudents(Student student[]) {
        for (Student st : student) {
            registerStudent(st);
        }
    }

    // Remove Student
    void removeStudent(String email) {

        Student toBeRemoved = null;

        for (Student st : students) {
            if (st.getStdEmail().equalsIgnoreCase(email)) {
                toBeRemoved = st;
                break;
            }
        }
        if (toBeRemoved != null) {
            students.remove(toBeRemoved);
            System.out.println("Student removed successfully");
        } else {
            System.out.println("Email not found");
        }

    }

    // Search
    void searchStudent(String email) {
        if (students.isEmpty()) {
            System.out.println("List if registration is empty");
            return;
        }

        for (Student st : students) {
            if (st.getStdEmail().equalsIgnoreCase(email)) {
                System.out.println("Registration found!");
                System.out.println(st);
                return;
            }
        }

        System.out.println("Registration not found");
    }


    public Student findStudentById(int searchId) {
        for (Student s : students) {
            if (s.getStdId() == searchId) {
                return s; // Student found! Return the object
            }
        }
        return null; // Loop finished and no student was found
    }

    public Student findStudentByName(String searchName) {
        for (Student s : students) {
            // Using equalsIgnoreCase so "Shlok" and "SHLOK" both work
            if (s.getStdName().equalsIgnoreCase(searchName)) {
                return s; // Student found!
            }
        }
        return null; // Not found
    }
    public void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No admissions yet.");
            return;
        }
        System.out.println("--- Admitted Students List ---");
        for (Student s : students) {
            System.out.println("ID: " + s.getStdId() + 
                               " | Name: " + s.getStdName() + 
                               " | Course: " + s.getCource() + 
                               " | Email: " + s.getStdEmail());
        }
    }

    // 2. Get total count of admissions
    public int getTotalCount() {
        return students.size();
    }

    // 3. Check if the admission list is empty
    public boolean isAdmissionEmpty() {
        return students.isEmpty();
    }

    // 4. Clear all admissions
    public void clearAllAdmissions() {
        students.clear();
        System.out.println("All admission records have been cleared.");
    }

}
