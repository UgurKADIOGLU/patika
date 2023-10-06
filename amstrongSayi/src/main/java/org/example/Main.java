package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number, basNumber, sayac = 0, result = 0, basPow, kalan=0,toplam=0,a;

       /* Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        number = scanner.nextInt();
        int tempNumber = number;
        while (tempNumber != 0) {
            tempNumber /= 10;
            // int kalan=a%10;
            sayac++;
        }
        tempNumber = number;
        while (tempNumber != 0) {
            basPow = 1;
            int kalan = tempNumber % 10;
            for (int i = 1; i <= sayac; i++) {
                basPow *= sayac;
            }
            result+=basPow;
            tempNumber /= 10;
            System.out.println(kalan);
            //sayac++;
        }
        System.out.println(result);*/

        Scanner scanner=new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        a=scanner.nextInt();
        while (a!=0){
            kalan=a%10;
            a/=10;
            toplam+=kalan;
            System.out.println(kalan);
            sayac++;
        }
        System.out.println(toplam);

    }
}