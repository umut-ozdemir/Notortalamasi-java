import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int Matematik, Fizik, Kimya, Turkce, Tarih, Muzik;

        System.out.println("Matematik notunuzu girin : ");
        Matematik = input.nextInt();

        System.out.println("Fizik notunuzu girin : ");
        Fizik = input.nextInt();

        System.out.println("Kimya notunuzu girin : ");
        Kimya = input.nextInt();

        System.out.println("Turkce notunuzu girin : ");
        Turkce = input.nextInt();

        System.out.println("Tarih notunuzu girin : ");
        Tarih = input.nextInt();

        System.out.println("Muzik notunuzu girin : ");
        Muzik = input.nextInt();

        int notOrt = (Matematik+Fizik+Kimya+Turkce+Tarih+Muzik)/6;

        String sonuc = (notOrt > 60) ? "Gectiniz" : "Kaldiniz";
        System.out.println(sonuc);


    }
}
