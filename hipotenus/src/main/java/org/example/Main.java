package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b,c;
        double d,u;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Üçgenin birci kenarının uzunluğunu giriniz : ");
        a = scanner.nextInt();

        System.out.print("Üçgenin ikinci kenarının uzunluğunu giriniz : ");
        b = scanner.nextInt();

        System.out.print("Üçgenin üçüncü kenarının uzunluğunu giriniz : ");
        c = scanner.nextInt();

        u=(a+b+c)/2;
        d=u*(u-a)*(u-b)*(u-c);
        System.out.println("Üçgenin alanı : "+d);
    }
}