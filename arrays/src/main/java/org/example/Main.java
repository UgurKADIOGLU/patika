package org.example;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {


        double[] list = {1, 2, 3, 4};
        //Arrays.fill(list, 1, 4, -3);
        System.out.println(Arrays.toString(list));
        double[] copyArray = Arrays.copyOfRange(list, 0,3);
        System.out.println(Arrays.toString(copyArray));
        System.out.println(Arrays.binarySearch(list, -3));
        harmonikOrtalama(list);
    }
    static void harmonikOrtalama(double[] arr){
        double toplam = 0,sayac=0;
        for (double sayi:arr
             ) {
            toplam=toplam+(1/sayi);
            sayac++;
        }
        System.out.println(toplam);
    }
}
