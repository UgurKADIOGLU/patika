package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int kilo;
        double vucutKitleIndeksi,boy;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz : ");
        boy=scanner.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz : ");
        kilo=scanner.nextInt();
        vucutKitleIndeksi=kilo/(boy*boy);
        System.out.println("Vucut kitle indeksiniz : "+vucutKitleIndeksi);

    }
}