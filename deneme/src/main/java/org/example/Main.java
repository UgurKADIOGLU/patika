package org.example;

public class Main {

    public static void main(String[] args) {
        Teacher teacher=new Teacher("Uğur","5054058060","Bilişim");
        //teacher.print();
        Course course=new Course("Tarih","101","Bilişim",100,10);
        Course courseOne=new Course("Bilişim","102","Bilişim",100,10);
        Course courseTwo=new Course("Hayat Bilgisi","103","Bilişim",100,10);
        course.teacher=new Teacher();
        course.addTeaher(teacher);
        //course.printTeacherInfo();
        Student student=new Student(course,courseOne,courseTwo,"Uğur","777","9");
        student.studentInfo();

    }
}
