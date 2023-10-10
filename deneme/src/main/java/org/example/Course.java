package org.example;

public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int snot;

    public Course(String name, String code, String prefix, int note,int snot) {
        //this.teacher = teacher;
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = note;
        this.snot=snot;
    }

    public Course() {
    }

    void addTeaher(Teacher teacher) {
        if (teacher.branch.equals(this.prefix)){
        this.teacher = teacher;
        printTeacherInfo();
        }else {
            System.out.println("Öğretmen ve ders bölümleri uyuşmuyor.");
        }

    }

    void printTeacherInfo() {
        this.teacher.print();
    }
}
