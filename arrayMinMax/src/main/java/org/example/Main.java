package org.example;

import java.sql.Array;

public class Main {
    public static void main(String[] args) {
        int[] list = {1, 2, 6, -5};
        min(list);
        max(list);
        enYakin(list,3);
    }

    static void min(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        System.out.println(min);
    }

    static void max(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println(max);
    }
    static void enYakin(int[] arr,int a){
        int enYakin=arr[0];
        int kucukEnyakin=a-arr[0],buyukEnYakin=a-arr[0];
        int fark=a-arr[0];
        for (int sayi:arr
             ) {
            if(a-sayi>0 && fark>a-sayi){
                kucukEnyakin=sayi;
            } else if (a-sayi<0 && fark>a-sayi) {
                buyukEnYakin=sayi;
            }
        }
        System.out.println("Girilen sayıdan küçük en yakın sayı : "+kucukEnyakin);
        System.out.println("Girilen sayıdan büyük en yakın sayı : "+buyukEnYakin);
    }
}