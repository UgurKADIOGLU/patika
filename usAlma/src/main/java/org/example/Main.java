package org.example;

import java.util.Scanner;

public class Main {
    public static int usAl(int taban, int us) {

        if (taban == 1 || us == 0) {
            return 1;
        }

        return taban * usAl(taban, us - 1);

    }
    public static void main(String[] args) {
        int taban,us;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Taban değerini giriniz : ");
        taban=scanner.nextInt();
        System.out.print("Üs değerini giriniz : ");
        us=scanner.nextInt();
        System.out.println("Sonuç : "+usAl(taban,us));

    }
}