package com.example.java_programs;

public class reverse_of_number {
    static int sum=0;

    static int num(int n){
        int r=n%10;

        if (n==0){
            return sum;
        }
        sum=(sum*10)+r;
        return num(n/10);

    }
    public static void main(String[] args) {
        int ans=num(5677);
        System.out.print(ans);

    }
}
