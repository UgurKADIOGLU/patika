package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int yariCap;
        double pi=3.14,alan,cevre;
        System.out.print("yarı çap giriniz : ");
        Scanner scanner=new Scanner(System.in);
        yariCap=scanner.nextInt();
        alan=pi*yariCap*yariCap;
        cevre=2*pi*yariCap;
        System.out.println("Dairenin alanı : "+alan+" çevresi : "+cevre);

    }
}