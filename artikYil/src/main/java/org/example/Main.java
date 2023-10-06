package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int yil;

        Scanner scanner=new Scanner(System.in);
        System.out.print("Hesaplamak istedğniz yılı girin : ");
        yil=scanner.nextInt();
        if(yil%400==0){
            System.out.println("Bu bir artık yıldır");
        } else if (yil%100==0) {
            System.out.println("Bu bir artık yıl değildir");
        }else if(yil%4==0){
            System.out.println("Bu bir artık yıldır");
        }else {
            System.out.println("Bu bir artık yıl değildir");
        }

    }
}