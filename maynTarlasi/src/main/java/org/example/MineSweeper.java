package org.example;

import java.util.Scanner;

public class MineSweeper {
    int row;
    int col;
    int random;
    int mineCol;
    int mineRow;
    int predicRow;
    int predicCol;
    int sayac;
    boolean isWin = true;
    int sayac1=0;

    public MineSweeper(int row, int col) {

        this.row = row;
        this.col = col;

    }

    void run() {
        Scanner scanner = new Scanner(System.in);

        String[][] tarla = new String[row][col];
        String[][] tarlaWithMine = new String[row][col];

        for (int i = 1; i <= (row * col) / 4; i++) {
            random = (int) (Math.random() * (row * col));
            mineRow = random / col;
            mineCol = random % col;
            tarlaWithMine[mineRow][mineCol] = " * ";
            System.out.println("Rastgele sayı : " + random);
            System.out.println("Satır : " + mineRow);
            System.out.println("Sütun : " + mineCol);
        }

        for (String[] row : tarlaWithMine
        ) {
            for (String bomb : row
            ) {
                if (bomb == null) {
                    System.out.print(" - ");
                } else {
                    System.out.print(bomb);
                }

            }
            System.out.println();
        }

        System.out.println("=======Mayınların konumu=======");

        while (isWin){
            System.out.print("Satır Giriniz : ");
            predicRow = scanner.nextInt();

            System.out.print("Sutun Giriniz : ");
            predicCol = scanner.nextInt();
            if(predicRow<0 || predicRow>row || predicCol<0 ||predicCol>col){
                System.out.println("Hatalı bir giriş yaptınız.");
            }else {
            if (predicRow < 0 && predicRow > row && predicCol < 0 && predicCol > col) {
                System.out.println("Alan dışı bir tahin yaptınız.");
            } else {
                //while (){
                sayac=0;
                for (int i = -1; i < 2; i++) {
                    for (int j = -1; j < 2; j++) {
                        int a = predicRow + i;
                        int b = predicCol + j;

                        if ((predicRow + i) >= 0 && (predicCol + j) >= 0 && (predicRow + i) <= row-1 && (predicCol + j) <= col-1)
                            if(!(tarlaWithMine[predicRow + i][predicCol + j]==null)){
                            if (tarlaWithMine[predicRow + i][predicCol + j].equals(" * ")) {
                                if (!(i == 0 && j == 0))
                                    sayac++;
                            }
                    }
                }
            }

            tarla[predicRow][predicCol] = String.valueOf(sayac);
            //System.out.println(sayac);
            for (String[] row : tarla
            ) {
                for (String number : row
                ) {
                    if (number == null) {
                        System.out.print(" - ");
                    } else {
                        System.out.print(" " + number + " ");
                    }

                }
                System.out.println();

            }
            if(tarlaWithMine[predicRow][predicCol]==null){

            }else {
                System.out.println("Bomba patladı.");
                isWin=false;
            }
            sayac1=0;
            for (String[] row:tarla
                 ) {
                for (String item:row
                     ) {
                    if(item==null){
                        sayac1++;
                    }
                }

            }
            int c=(row * col) / 4;
            if(sayac1==c){
                System.out.println("Tebriker kazandınız.");
                isWin=false;
            }
        }
    }
}}}
