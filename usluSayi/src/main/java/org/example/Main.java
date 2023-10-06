package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int taban,ust,toplam=1;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Taban sayısını giriniz : ");
        taban=scanner.nextInt();
        System.out.print("Üst sayısını giriniz : ");
        ust=scanner.nextInt();
        for (int i=1;i<=ust;i++){
            toplam*=taban;
        }
        System.out.println(toplam);
    }
}