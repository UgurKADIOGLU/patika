package org.example;

public class Main {
    public static void main(String[] args) {
        Fighter f1=new Fighter("Uğur",10,100,80,50);
        Fighter f2=new Fighter("Ayşe",10,300,50,100);

        Match match=new Match(f1,f2,45,100);
        if(match.whoStart()==f1){

        }else {
            match.f1=f2;
            match.f2=f1;
        }
        match.run();
        //System.out.println(match.who().name);


    }
}