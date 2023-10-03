package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("kdv'sini hesaplamak istediğiniz rakamı yazınız : ");
        double deger= scanner.nextInt();
        double tutar=(deger<1000)?deger*1.18:deger*1.08;
        System.out.println(tutar);
    }
}