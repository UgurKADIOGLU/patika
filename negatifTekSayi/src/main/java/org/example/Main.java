package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number,toplam=0;
        boolean isNegative=true;
        Scanner scanner=new Scanner(System.in);


        do{
            System.out.print("Lütfen bir sayı giriniz : ");
            number=scanner.nextInt();

                    if(number%4==0){
                        toplam+=number;
                    }


        }while (number>0);
        System.out.println(toplam);
    }
}