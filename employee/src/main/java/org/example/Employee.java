package org.example;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax() {
        if (salary > 1000) {
            double tax = salary * 0.03;
            return tax;
        } else {
            return 0;
        }
    }

    double bonus() {
        double bonus = 0;
        if (workHours > 40) {
            bonus = (workHours - 40) * 30;
            return bonus;
        } else {
            return 0;
        }

    }

    double raiseSalary() {
        double zam = 0;
        if (2021 - hireYear < 10) {
            zam = salary * 0.05;
            return zam;
        } else if (9 < 2021 - hireYear && 2021 - hireYear < 20) {
            zam = salary * 0.10;
            return zam;
        } else {
            zam = salary * 0.15;
            return zam;
        }

    }

    void info() {
        System.out.println("Adı : " + name);
        System.out.println("Maaşı : " + salary);
        System.out.println("Bşlagıç Yılı : " + hireYear);
        System.out.println("Vergi : " + tax());
        System.out.println("Bonus : " + bonus());
        System.out.println("Maaş artışı : " + raiseSalary());
        System.out.println("Vergi ve bonuslar ile birlikte maaş : " + (salary - tax() + bonus()));
        System.out.println("Toplam maaş : "+(salary-tax()+bonus()+raiseSalary()));
    }
}
