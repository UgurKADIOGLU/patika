package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String password,username,savedPassword="password",savedUsername="username"
                ,newPassword;

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen bir kulllanıcı adı giriniz : ");
        username=scanner.nextLine();

        System.out.println("Lütfen bir şifre giriniz : ");
        password=scanner.nextLine();

        if (username.equals(savedUsername) && password.equals(savedPassword)){
            System.out.println("Başarılı bir giriş yaptınız");
        } else {
            System.out.println("Şifreniz yanlış. Şifrenizi değiştirmek isterseniz 1 yazınız : ");
            int sonuc=scanner.nextInt();
            if (sonuc==1){
                Scanner scanner1=new Scanner(System.in);
                System.out.println("Yeni bir şifre giriniz : ");
                newPassword=scanner1.nextLine();
                if (savedPassword.equals(newPassword)){
                    System.out.println("Eski şifreniz ile şifreniz aynı farklı bir şifre giriniz");
                    newPassword=scanner.nextLine();
                    savedPassword=newPassword;
                }else {
                    savedPassword=newPassword;
                    System.out.println("yeni şifreniz : "+savedPassword);
                }
            }
        }
    }
}