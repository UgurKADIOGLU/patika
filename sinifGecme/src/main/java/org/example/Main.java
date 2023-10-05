package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat,fizik,turkce,kimya,muzik,toplam;
        double ortalama;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen matemetik notunu giriniz");
        mat=scanner.nextInt();
        if(!(mat>0 && mat<100)){
             mat=0;
        }
        System.out.println("Lütfen fizik notunu giriniz");
        fizik=scanner.nextInt();
        if(!(fizik>0 && fizik<100)){
            fizik=0;
        }
        System.out.println("Lütfen türkçe notunu giriniz");
        turkce=scanner.nextInt();
        if(!(turkce>0 && turkce<100)){
            turkce=0;
        }
        System.out.println("Lütfen kimya notunu giriniz");
        kimya=scanner.nextInt();
        if(!(kimya>0 && kimya<100)){
            kimya=0;
        }
        System.out.println("Lütfen müzik notunu giriniz");
        muzik=scanner.nextInt();
        if(!(muzik>0 && muzik<100)){
            muzik=0;
        }
        ortalama=(mat+fizik+turkce+kimya+muzik)/5;
        if(ortalama<55){
            System.out.println("kaldınız : "+ortalama);
        }else {
            System.out.println("geçtiniz : "+ortalama);
        }
    }
}