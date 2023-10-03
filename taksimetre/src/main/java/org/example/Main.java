package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a = 20, b = 10, km;
        double c = 2.2, tutar, start = 10;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Km giriniz : ");
        km = scanner.nextInt();
        tutar = km * c;
        tutar += start;
        tutar = (tutar < 20) ? 20 : tutar;
        System.out.println("Ödeyeceğniz tutar : " + tutar);
    }
}