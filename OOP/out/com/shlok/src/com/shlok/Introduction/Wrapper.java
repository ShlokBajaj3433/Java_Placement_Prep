package com.shlok.Introduction;

// character into a Object
// java is a pass by value language
public class Wrapper {
    public static void main(String[] args) {
        int a = 10 ;
        int b = 20 ;

        Integer num1 = 30 ; // is an object of Integer class
        Integer num2 = 40 ; // refers to an object of Integer class
        
        swap(a,b);
        swap(num1,num2);
        System.out.println(a + " " + b);
        System.out.println(num1 + " " + num2);

        final TryingGarbageCollector obj = new TryingGarbageCollector("Shlok Bajaj");

        TryingGarbageCollector obj2;

        for(int i = 0 ; i < 100000000 ; i++){
            obj2 = new TryingGarbageCollector("Object " + i);
        }
        
    } 

        
    
        static void swap(Integer x , Integer y){ // due to final class we cannot extend it and override the method to change the value of x and y
            Integer temp = x ;
            x = y ;
            y = temp ;
        }

        

        
        public static class TryingGarbageCollector {
            String name ;

            TryingGarbageCollector(String name){
                this.name = name ;
            }
            protected void finalize() throws Throwable{ // finalize method is called when the object is garbage collected
            System.out.println("Object is Destroyed");
        }
        }
    }
