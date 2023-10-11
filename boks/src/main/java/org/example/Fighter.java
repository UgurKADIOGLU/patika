package org.example;

public class Fighter {
    String name;
    int damge;
    int healty;
    int weight;
    int dodge;

    public Fighter(String name, int damge, int healty, int weight,int dodge) {
        this.name = name;
        this.damge = damge;
        this.healty = healty;
        this.weight = weight;
        this.dodge=dodge;
    }

    int hit(Fighter foe){
        System.out.println(this.name+" => "+foe.name+" "+this.damge+" hasar vurdu.");
        if(isDodge()){
            System.out.println(foe.name+" gelen hasarı blokladı.");
            return foe.healty;
        }
        System.out.println(foe.healty);
        if (foe.healty-damge<0){
            return 0;
        }
        return foe.healty-this.damge ;


    }
    boolean isDodge(){
        double random=Math.random()*100;
        return random<=dodge;
    }

}
