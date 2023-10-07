package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int numberOne,numberTwo,ebob= 1,ekok=1 ;
        System.out.print("Birnci sayıyı giriniz : ");
        numberOne=scanner.nextInt();
        System.out.print("İkinci sayıyı giriniz : ");
        numberTwo=scanner.nextInt();
        if(numberOne<numberTwo){
            int i=1;
            while (i<numberOne){
                if(numberOne%i==0&&numberTwo%i==0){
                    ebob=i;
                    i++;
                }else {
                    i++;
                }
            }
        }else {
            int j=1;
            while (j<numberTwo){
                if(numberTwo%j==0&&numberTwo%j==0){
                    ebob=j;
                    j++;
                }else {
                    j++;
                }
            }
        }
        System.out.println("Ebob : "+ ebob);

        ekok=(numberOne*numberTwo)/ebob;
        System.out.println("Ekok : "+ekok);

    }
}