
// Topic: Java OOP Basics - Classes, Objects, Constructors, and Copy Constructor
// Demonstrates: Defining a class, creating objects, using constructors (default, parameterized, copy), and object references.
// Author: [Your Name]
// Date: February 2026
package com.shlok.Introduction;

public class Main {

    public static void main(String[] args) {

        

        Student Bajaj = new Student(15, "Bajaj Kushwaha", 85.4f);
        Student rahul = new Student(18, "Rahul Rana", 90.3f);

        System.out.println(Bajaj.num);
        System.out.println(Bajaj.name);
        System.out.println(Bajaj.marks);

        Student random = new Student(Bajaj);
        System.out.println(random.name);

        Student random2 = new Student();
        System.out.println(random2.name);

        Student one = new Student();
        Student two = one;

        one.name = "Something something";

        System.out.println(two.name);


    }
 
    static class Student {
            
            int num ;
            String name ;
            float marks ;
            
            Student(){
               this(11,"shlok",100);
            }

                Student(Student other){
                    this.num = other.num ;
                    this.name = other.name ;
                    this.marks = other.marks ;
                }
            
            Student(int num , String name , float marks){
                this.num = num ;
                this.name = name ;
                this.marks = marks ;
            }
            
        }
}