package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] a={{1,2,3,7},{4,5,6,8}};
        int row=a.length;
        int col=a[0].length;
        int[][] newlist=new int[col][row];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                newlist[j][i]=a[i][j];
            }
        }
        for (int[] satir:newlist
             ) {
            for (int sutun:satir
                 ) {
                System.out.print(" , "+sutun);
            }
            System.out.println();
        }
        //System.out.println(Arrays.toString(newlist));
    }
}