package com.example.java_programs;
import static com.example.java_programs.oop1.message;//here we are specifying the package name under which oop2.java file lies.

public class oop2 {
    int age;
    String name;
    int salary;
    boolean married;
    static long population; //this property is common for all, so we use static . static variables are not related to objects at all
    static void message(){
        System.out.print("hello world");
        // System.out.println(this.age); "this" keywrod can't be used here becuase it refers to an object and here we are using static keyword.
    }
    public oop2(int age, String name, int salary, boolean married){//, long population) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        oop2.population = population+1; //this represents the object, but here we can use the class name too becoz this is common to all objects.
    }
}
