package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int k,i,toplam=0,sayac=0;
        double ortalama;
        System.out.print("Bir sayı girniz: ");
        Scanner scanner=new Scanner(System.in);
        k=scanner.nextInt();
        for(i=0;i<=k;i++){
            if(i%3==0 && i%4==0){
                toplam+=i;
                sayac+=1;
            }
        }
        ortalama=toplam/sayac;
        System.out.println(ortalama);


    }
}