package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean isAsal=true;
        Scanner scanner=new Scanner(System.in);
        for (int i=2;i<100;i++){
            isAsal=true;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    isAsal=false;
                }
            }
            if(isAsal)
                System.out.println(i);
        }
    }
}