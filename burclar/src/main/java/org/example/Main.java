package org.example;

import com.sun.jdi.LongValue;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int day, mounth;
        boolean isError=false;
        String burc="";

        System.out.println("Doğduğunuz ayı giriniz : ");
        mounth=scanner.nextInt();
        System.out.println("Doğduunuz günü giriniz : ");
        day=scanner.nextInt();

        if(mounth==1){
            if((day >= 1)&&(day<=31)){
                if(day<22){
                    burc="Oğlak";
                }else {
                    burc= "Kova";
                }
            }else {
                isError=true;
            }
        }
        if(mounth==2){
            if((day >= 1)&&(day<=31)){
                if(day<20){
                    burc="Kova";
                }else {
                    burc= "Balık";
                }
            }else {
                isError=true;
            }
        }
        if(mounth==3){
            if((day >= 1)&&(day<=31)){
                if(day<20){
                    burc="Balık";
                }else {
                    burc= "Koç";
                }
            }else {
                isError=true;
            }
        }
        if(mounth==4){
            if((day >= 1)&&(day<=31)){
                if(day<21){
                    burc="Koç";
                }else {
                    burc= "Boğa";
                }
            }else {
                isError=true;
            }
        }
        if(mounth==5){
            if((day >= 1)&&(day<=31)){
                if(day<21){
                    burc="Boğa";
                }else {
                    burc= "İkizler";
                }
            }else {
                isError=true;
            }
        }
        if(mounth==6){
            if((day >= 1)&&(day<=31)){
                if(day<22){
                    burc="İkizler";
                }else {
                    burc= "Yengeç";
                }
            }else {
                isError=true;
            }
        }
        if(mounth==7){
            if((day >= 1)&&(day<=31)){
                if(day<22){
                    burc="Yengeç";
                }else {
                    burc= "Aslan";
                }
            }else {
                isError=true;
            }
        }
        if(mounth==8){
            if((day >= 1)&&(day<=31)){
                if(day<22){
                    burc="Aslan";
                }else {
                    burc= "Başak";
                }
            }else {
                isError=true;
            }
        }
        if(mounth==9){
            if((day >= 1)&&(day<=31)){
                if(day<22){
                    burc="Başak";
                }else {
                    burc= "Terazi";
                }
            }else {
                isError=true;
            }
        }
        if(mounth==10){
            if((day >= 1)&&(day<=31)){
                if(day<22){
                    burc="Terazi";
                }else {
                    burc= "Akrep";
                }
            }else {
                isError=true;
            }
        }
        if(mounth==11){
            if((day >= 1)&&(day<=31)){
                if(day<22){
                    burc="Akrep";
                }else {
                    burc= "Yay";
                }
            }else {
                isError=true;
            }
        }
        if(mounth==12){
            if((day >= 1)&&(day<=31)){
                if(day<22){
                    burc="Yay";
                }else {
                    burc= "Oğlak";
                }
            }else {
                isError=true;
            }
        }
        if(isError){
            System.out.println("Girdiğiniz rakamlarda bir yanlışlık var...");
        }else {
            System.out.println("Burcunuz : "+burc);
        }
    }
}