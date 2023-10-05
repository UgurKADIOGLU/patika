package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int havaSicakligi;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sıcaklık giriniz : ");
        havaSicakligi = scanner.nextInt();
        if (havaSicakligi < 5) {
            System.out.println("kayak yapabilirsiniz");
        } else if (havaSicakligi >= 5 && havaSicakligi <= 10) {
            System.out.println("Sinemaya gidebilirsin.");
        } else if (havaSicakligi >= 10 && havaSicakligi <= 15) {
            System.out.println("Sinemaya gidebilirsin.");
            System.out.println("Pikniğe gidebilirsiniz");
        }else if (havaSicakligi >= 15 && havaSicakligi <= 25) {
            System.out.println("Pikniğe gidebilirsiniz");
        }else {
            System.out.println("yüzmeye gidebilirsiniz");
        }

    }
}