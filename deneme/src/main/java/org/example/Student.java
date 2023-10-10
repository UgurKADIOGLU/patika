package org.example;

public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double avarage;
    boolean isPass;

    public Student(Course c1, Course c2, Course c3, String name, String stuNo, String classes) {
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        //this.avarage = avarage;
    }
    void addCourse(Course course){
        this.c1=course;
    }
    void addBulkExamNote(int note1,int note2,int note3,int snot1,int snot2,int snot3){
        double not1=0,not2 = 0,not3;
        if(note1>=0 && note1<=100){
            c1.note=note1;
            c1.snot=snot1;
            not1=(c1.snot*0.8)+(c1.snot*0.2);
        }else {
            System.out.println("Yanlış bir değer girdiniz.");
        }
        if(note2>=0 && note2<=100){
            c2.note=note2;
            c2.snot=snot2;
            not2=(c2.snot*0.8)+(c2.snot*0.2);
        }else {
            System.out.println("Yanlış bir değer girdiniz.");
        }
        if(note3>=0 && note3<=100){
            c3.note=note3;
            c3.snot=snot3;
            not3=(c3.snot*0.8)+(c3.snot*0.2);
        }else {
            System.out.println("Yanlış bir değer girdiniz.");
        }
        this.avarage=(not1+not2+note3)/3;
        System.out.println("Ortalama : "+avarage);
    }
    void studentInfo(){
        System.out.println(c1.name+ " : "+c1.note);
        System.out.println(c2.name+ " : "+c2.note);
        System.out.println(c3.name+ " : "+c3.note);
        System.out.println("İsim : "+name);
        System.out.println("No : "+stuNo);
        System.out.println("Sınıf : "+classes);
        addBulkExamNote(c1.note,c1.snot,c2.note,c2.snot,c3.note,c3.snot);
        isPass();
    }
    void isPass(){
        if(avarage<55){
            System.out.println("Kaldınız.");
        }else {
            System.out.println("Geçtniz.");
        }

    }
}
