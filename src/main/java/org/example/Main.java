package org.example;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Matematik notunu girermisiniz : ");
        int matematik = scanner.nextInt();
        System.out.print("Fizik notunu girermisiniz : ");
        int fizik = scanner.nextInt();
        System.out.print("Kimya notunu girermisiniz : ");
        int kimya = scanner.nextInt();
        System.out.print("Türkçe notunu girermisiniz : ");
        int turkce = scanner.nextInt();
        System.out.print("Tarih notunu girermisiniz : ");
        int tarih = scanner.nextInt();
        System.out.print("Müzik notunu girermisiniz : ");
        int muzik = scanner.nextInt();
        double ortalama = (matematik + fizik + kimya + turkce + tarih + muzik) / 6;
        System.out.println("Ortalamanız : " + ortalama);
        String sonuc = (ortalama > 60) ? "Geçti" : "Kaldı";
        System.out.println(sonuc);
    }
}