package org.example;

public class Main {
    static boolean isFind(int[][] arr,int value){
        for (int i=0;i<arr[0].length;i++){
            if(arr[0][i]==value){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {

        int[] liste={1,1,1,4,5,6,7,8,9,9};
        int[][] tekrar=new int[2][liste.length];

        int sayac=0;
        int a=0;
        for (int i=0;i< liste.length;i++){
            sayac=0;
            for(int j=0;j<liste.length;j++){
                if(!(isFind(tekrar,liste[i])) && liste[i]==liste[j]){
                    sayac++;
                }
            }
            boolean m=!(isFind(tekrar,liste[i]));
            if(!(isFind(tekrar,liste[i]))){
                //System.out.println((i+1)+" sayısı "+sayac+" kere tekrar edildi.");
                tekrar[0][a]=sayac;
                tekrar[1][a]=liste[i];
                a++;
            }

        }
        System.out.println("Tekrar sayıları : ");
        for (int i=0;i<tekrar.length;i++) {
            for (int j=0;j<tekrar[0].length;j++) {
                System.out.println(tekrar[i][j]+ " sayısı" + j);
            }

        }

    }
}