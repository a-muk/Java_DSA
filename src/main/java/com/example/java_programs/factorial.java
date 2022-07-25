package com.example.java_programs;

public class factorial {
    public static void main(String[] args) {
        factorial facc=new factorial();

        int ans=facc.fact(5);
        System.out.println(ans);
    }
    int fact(int n){
        if (n==0){
            return 1;
        }
        return n*fact(n-1);
    }
}
