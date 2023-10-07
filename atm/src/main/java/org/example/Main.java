package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password;
        int hak = 3,select;
        double balance=1500,price;
        Scanner scanner = new Scanner(System.in);

        while (hak > 0) {
            System.out.print("Kullanıcı adınız : ");
            userName = scanner.nextLine();
            System.out.println("Şifreniz : ");
            password = scanner.nextLine();
            if (userName.equals("user") && password.equals("password")) {
                System.out.println("Merhaba X bankasına hoş geldiniz : ");
                do {
                    System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz");
                    System.out.println(
                            "1 - Para yatırma\n"
                                    + "2 - Para çekme\n"
                                    + "3 - Bakiye sorgulama\n"
                                    +"4 - Çıkış yap"
                    );
                    select=scanner.nextInt();
                    switch (select){
                        case 1:
                            System.out.println("Para miktarı : ");
                            price=scanner.nextDouble();
                            balance+=price;
                            System.out.println("Bakiyeniz : "+balance);
                        case 2:
                            System.out.println("Para miktarı : ");
                            price=scanner.nextDouble();
                            if (price>balance){
                                System.out.println("Bakiye yetersiz");
                            }else {
                                balance-=price;
                                System.out.println("Bakiyeniz : "+balance);
                            }
                        case 3:
                            System.out.println("Para miktarı : "+balance);
                    }
                }while (select!=4);

                break;
            } else {
                System.out.println("hatalı şifre veya kullanıcı adı");
                hak--;
                if (hak == 0) {
                    System.out.println("hesabınız bloke oldu");
                }
                System.out.println("Kalan hakkınız : " + hak);
            }
        }

    }
}