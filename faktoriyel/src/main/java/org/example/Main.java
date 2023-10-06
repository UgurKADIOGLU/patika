package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number,numberTwo,faktoriyel=1,kombinasyon=1,cıkarmaKombinasyon=1;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Faktöriyel sayısını girini : ");
        number=scanner.nextInt();
        System.out.print("Kombinasyon sayısını girini : ");
        numberTwo=scanner.nextInt();
        for(int i=1;i<=number;i++){
            faktoriyel*=i;
        }
        for(int i=1;i<=numberTwo;i++){
            kombinasyon*=i;
        }
        for(int i=1;i<=(number-numberTwo);i++){
            cıkarmaKombinasyon*=i;
        }
        System.out.println(faktoriyel);
        try {
            int kom=faktoriyel/(kombinasyon*cıkarmaKombinasyon);
            System.out.println(kom);
        }catch (Exception e){
            System.out.println("");
        }

    }
}