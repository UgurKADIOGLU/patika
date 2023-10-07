package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numberCount,number,i=1,enBuyuk=0,enKucuk=0;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz : ");
        numberCount= scanner.nextInt();

        while (i<=numberCount){
            System.out.print(i+" . sayıyı giriniz : ");
            number=scanner.nextInt();
            if(i==1){
                enBuyuk=number;
                enKucuk=number;
            }
            if(number<enKucuk){
                enKucuk=number;
            } else if (number>enBuyuk) {
                enBuyuk=number;
            }
            i++;
        }
        System.out.println("En büyük sayı "+enBuyuk+" en küçük sayı "+enKucuk);
    }
}