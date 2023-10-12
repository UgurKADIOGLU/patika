package org.example;

public class Main {
    public static void main(String[] args) {
        String[][] letter=new String[5][4];
        for (int i=0;i<letter.length;i++){
            for (int j=0;j<letter[0].length;j++){
                if(i==0 || i==2 || i==4){
                    letter[i][j]="*";
                }else if (j==0 || j==3){
                    letter[i][j]="*";
                }else {
                    letter[i][j]=" ";
                }
                System.out.println();
            }
            for (String[] yildiz:letter
                 ) {
                for (String y:yildiz
                     ) {
                    System.out.print(y);
                }
                System.out.println();
            }
        }

    }
}