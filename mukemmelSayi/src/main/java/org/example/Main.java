package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number,toplam=0;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        number=scanner.nextInt();
        for(int i=1;i<number;i++){
            if(number%i==0){
                toplam+=i;
            }
        }
        if(toplam==number){
            System.out.println("Bu bir mükemmel sayıdır.");
        }else {
            System.out.println("Bu mükemmel sayı değldir.");
        }
    }
}