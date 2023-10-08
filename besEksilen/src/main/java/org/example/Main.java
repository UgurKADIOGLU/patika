package org.example;

public class Main {
    public static int besEksilen(int a){
        boolean isNegatif=false;
        int temp=a;

        if (isNegatif==true&&a==temp){
            return a;
        }
        System.out.println(temp);
        if (temp<=0){
            isNegatif=true;
        }
        if (!isNegatif){
        return besEksilen(temp-5);
        } else {
           return besEksilen(temp+5);
        }


    }
    public static void main(String[] args) {
besEksilen(12);
    }
}