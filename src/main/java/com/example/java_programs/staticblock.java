package com.example.java_programs;

public class staticblock {
    static int a = 4;
    static int b;

    static {
        System.out.println("I am in static block");
        b=a*5;

    }

    public static void main(String[] args) {
        staticblock obj = new staticblock();
        System.out.println(obj.a+" "+obj.b);
        obj.b+=3;
        System.out.println(obj.a+" "+obj.b);
    }
    //staticblock is being called only once. We are initialising a static variable using classes.

}