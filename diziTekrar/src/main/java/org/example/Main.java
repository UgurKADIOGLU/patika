package org.example;

import java.util.Arrays;

public class Main {
    static boolean isFind(int[] arr,int value){
        for(int i:arr){
            if(i==value){
                return true;
            }
        }
        return false;
    }
    static boolean isCift(int value){
        if(value%2==0){
            return true;
        }else {
            return false;
        }
    }
    public static void main(String[] args) {
        int[] liste={2,2,2,3,3,3};
        int[] tekrarEden=new int[liste.length];
        int sayac=0;

        for (int i=0;i< liste.length;i++ ) {
            for (int j=0;j<liste.length;j++){
                if (!(i==j)&&(liste[i]==liste[j])){
                    if (!isFind(tekrarEden,liste[i])){
                        if(isCift(liste[i]))
                        tekrarEden[sayac++]=liste[i];
                    }
               break;
                }
            }
        }
        System.out.println(Arrays.toString(tekrarEden));
    }
}