package org.example;

public class Main {
    static int r(int n){
        System.out.println(n);
        if (n==1){
            return 1;
        }
        return r(n-1)+n;
    }
    public static void main(String[] args) {
        System.out.println(r(10));
    }
}
