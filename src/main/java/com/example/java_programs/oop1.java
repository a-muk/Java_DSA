package com.example.java_programs;
import static com.example.java_programs.oop2.*;
public class oop1 {
    public static void main(String[] args) {
        //why do we use public static void main()?
        //--> Becoz this function will not depend on any object. We can use main() without creating an object. main() is the first thing that we have to run in java. To run a class, we ofc need to create an object of the class to access all it
        // properties. But how can we run the program to create an object if main is the very first thing that is running? That's why it is given as static function.

        oop2 attreyee= new oop2(19,"attreyee mukherjee",97655,false);
        oop2 abc= new oop2(19, "abc",92928, false);
        System.out.println(attreyee.population);
        System.out.println(abc.population);

    }
    public static void message(){ //public means it is available from other files too.
        System.out.println("hello");
    }
}

