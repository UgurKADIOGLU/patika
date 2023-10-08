package org.example;

import java.util.Scanner;

public class Main {
    static int sum(int a,int b){
        int result=a+b;
        System.out.println("Toplam : "+result);
        return result;
    }
    static int minus(int a,int b){
        int result=a-b;
        System.out.println("Çıkarma : "+result);
        return result;
    }
    static int times(int a,int b){
        int result=a*b;
        System.out.println("Çarpım : "+result);
        return result;
    }
    static double divided(double a,double b){
        if(b==0){
            System.out.println("İkinci sayı sıfırdan farklı olmalı.");
            return 0;
        }
        double result=a/b;
        System.out.println("Bölüm : "+result);
        return result;
    }
    static int power(int a,int b){
        int result=1;
        for (int i=1;i<=b;i++){
            result*=a;
        }
        System.out.println(a+" üssü "+b+" : "+result);
        return result;
    }
    static double mod(int a,int b){
        double result =a%b;
        System.out.println(a+" mod "+b+" : "+result);
        return result;
    }
    static void calulate(int a,int b){
        int cevre=2*(a+b);
        int alan=a*b;
        System.out.println("Çevresi : "+cevre);
        System.out.println("Alanı : "+alan);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int select;

        String menu="1- Toplama işlemi\n"+
                "2- Çıkarma işlemi\n"+
                "3- Çarpma işlemi\n"+
                "4- Bölme işlemi\n"+
                "5- Üslü sayı hesaplama\n"+
                "6- Mod alma\n"+
                "7- Dikdörtgen alan ve çevre hesabı\n"+
                "8- Çıkış yap";
        while (true){
            System.out.println(menu);
            System.out.print("Bir işlem seçiniz: ");
            select= scanner.nextInt();
            if(select==0){
                break;
            }
            System.out.print("Bir a sayısı giriniz : ");
            int a= scanner.nextInt();
            System.out.print("Bir b sayısı giriniz : ");
            int b= scanner.nextInt();
            switch (select){
                case 1:
                    sum(a,b);
                    break;
                case 2:
                    minus(a,b);
                    break;
                case 3:
                    times(a,b);
                    break;
                case 4:
                    if(divided(a,b)==0){
                    System.out.println("İkinci sayı sıfırdan farklı olmalı.");
                };
                    break;
                case 5:
                    power(a,b);
                    break;
                case 6:
                    mod(a,b);
                    break;
                case 7:
                    calulate(a,b);
                    break;
            }
        }
    }
}