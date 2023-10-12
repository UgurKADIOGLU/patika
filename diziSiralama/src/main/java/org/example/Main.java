package org.example;

import java.util.Arrays;

public class Main {
    static boolean isFind(int[] arr, int value){
        for(int i=0;i<arr.length;i++){
            if(value==arr[i]){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {

        int[] liste={9,8,7,6,1000,50,3,2,100,1};
        int buyuk=liste[0];
        int[] sirali=new int[liste.length];
        int sayac=0;

        for (int i=0;i< liste.length;i++) {
            buyuk=sirali[i];
            for (int j=0;j< liste.length;j++){
                //System.out.println(!(isFind(sirali,liste[j])));
                //System.out.println(liste[i]+" "+liste[j]);
                if(!(isFind(sirali,liste[j])) && liste[j]>buyuk){
                    buyuk=liste[j];

                }

            }
            sirali[sayac++]=buyuk;
        }
        System.out.println(Arrays.toString(sirali));
    }
}