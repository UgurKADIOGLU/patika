package org.example;

public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    public Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }
    void run(){
        if(isCheck()){


            while (this.f1.healty>0 && this.f2.healty>0){
                System.out.println("=====Yeni Round=====");
                f2.healty= f1.hit(f2);
                if(isWin()){
                    break;
                }
                f1.healty=f2.hit(f1);
                if(isWin()){
                    break;
                }

            }
        }else {
            System.out.println("Sporcuların sikletleri uymuyor.");
        }
    }
    boolean isCheck(){
        System.out.println(f2.healty);
        return (this.f1.weight>=minWeight&&this.f1.weight<=maxWeight)
                &&(this.f2.weight>=minWeight&&this.f2.weight<=maxWeight);
    }
    boolean isWin(){
        if(f1.healty==0){
            System.out.println(f2.name+" kazandı.");
            return true;
        }
        if (f2.healty==0){
            System.out.println(f1.name+" kazandı.");
        }
        return false;
    }
    Fighter whoStart(){
        double random=Math.random();
        if(random<=0.5){
            return f1;
        }else {
            return f2;
        }
    }

}
