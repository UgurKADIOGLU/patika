package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int km, yas, yolculukTip;
        double tutar;

        System.out.println("Yolculuk yapacağınız mesafeyi km olarak yazınız : ");
        km = scanner.nextInt();
        if (km < 0) {
            System.out.println("lütfen pozitif bir değer giriniz : ");
            km = scanner.nextInt();
        }
        System.out.println("Yaşınızı yazınız : ");
        yas = scanner.nextInt();
        if (yas < 0) {
            System.out.println("lütfen pozitif bir değer giriniz : ");
            yas = scanner.nextInt();
        }
        System.out.println("Yolculuk tipini giriniz (tek yön içn 1 gdiş dönüş için 2) : ");
        yolculukTip = scanner.nextInt();
        if (!(yolculukTip == 1 || yolculukTip == 2)) {
            System.out.println("Yolculuk tipini doğru giriniz : ");
            yolculukTip = scanner.nextInt();
        }

        if (yolculukTip == 1) {
            tutar = km * 0.10;
            System.out.println("Normal tutar : " + tutar);
            if (yas < 12) {
                tutar = tutar * 0.5;
                System.out.println("Toplam tutar"+tutar);
            } else if (12<yas || yas<24) {
                tutar=tutar*0.9;
                System.out.println("Toplam tutar"+tutar);
            } else if (yas>65) {
                tutar=tutar*0.7;
                System.out.println("Toplam tutar"+tutar);
            }
        } else if (yolculukTip == 2) {
            tutar = (km * 0.10)*2;
            System.out.println("Normal tutar : " + tutar);
            if (yas < 12) {
                tutar = (tutar * 0.5)*0.8;
                System.out.println("Toplam tutar"+tutar);
            } else if (12<yas || yas<24) {
                tutar=(tutar*0.9)*0.8;
                System.out.println("Toplam tutar"+tutar);
            } else if (yas>65) {
                tutar=(tutar*0.7)*0.8;
                System.out.println("Toplam tutar"+tutar);
            }


    }


}
}