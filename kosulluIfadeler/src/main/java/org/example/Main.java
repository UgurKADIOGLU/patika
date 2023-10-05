package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
   int numberOne, numberTwo,secim,sonuc;

        Scanner scanner=new Scanner(System.in);
        System.out.println("Birinci sayıyı girniz : ");

        numberOne=scanner.nextInt();
        System.out.println("İkinci sayıyı girniz : ");
        numberTwo=scanner.nextInt();

        System.out.println("1 Toplama\n 2 Çıkarma\n 3 Çarpma\n 4 Bölme\n");
        System.out.println("Bir değer giriniz : ");
        secim=scanner.nextInt();
        /*if(secim==1){
            System.out.println("Toplama işlemnin sonucu : "+(numberOne+numberTwo));
        } else if (secim ==2) {
            System.out.println("Çıkarma işlemnin sonucu : "+(numberOne-numberTwo));
        }else if (secim ==3) {
            System.out.println("Çarpma işlemnin sonucu : "+(numberOne*numberTwo));
        }else if (secim ==4) {
            System.out.println("Bölme işlemnin sonucu : "+(numberOne/numberTwo));
        }*/
        switch (secim){
            case 1:
                System.out.println("Toplama işlemnin sonucu : "+(numberOne+numberTwo));
                break;
            case 2:
                System.out.println("Çıkarma işlemnin sonucu : "+(numberOne-numberTwo));
                break;
            case 3:
                System.out.println("Çarpma işlemnin sonucu : "+(numberOne*numberTwo));
                break;
            case 4:
                System.out.println("Bölme işlemnin sonucu : "+(numberOne/numberTwo));
                break;
            default:
                System.out.println("Doğru bir seçim yamadınız ");
        }


    }
}