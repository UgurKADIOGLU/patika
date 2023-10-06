package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double toplam=0;
        Scanner scanner=new Scanner(System.in);
        System.out.print("N sayısını giriniz : ");
        int n =scanner.nextInt();
        for(int i=1;i<=n;i++){
            toplam+=(1.0/i);
        }
        System.out.println(toplam);
    }
}