package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int armutKilo, elmaKilo,domatesKilo,muzKilo,patlicanKilo;
        double toplam,armutFiyat=2.14,elmaFiyat=3.67,domatesFiyat=1.11,muzFiyat=0.95,patlicanFiyat=5.00;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Armut kaç kilo ? : ");
        armutKilo=scanner.nextInt();
        System.out.print("Elma kaç kilo ? : ");
        elmaKilo=scanner.nextInt();
        System.out.print("Domates kaç kilo ? : ");
        domatesKilo=scanner.nextInt();
        System.out.print("Muz kaç kilo ? : ");
        muzKilo=scanner.nextInt();
        System.out.print("Patlıcan kaç kilo ? : ");
        patlicanKilo=scanner.nextInt();
        toplam=armutKilo*armutFiyat+elmaFiyat*elmaKilo+domatesFiyat*domatesKilo+muzFiyat*muzKilo+patlicanFiyat*patlicanKilo;
        System.out.println("Toplam Tutar : "+toplam);
    }
}