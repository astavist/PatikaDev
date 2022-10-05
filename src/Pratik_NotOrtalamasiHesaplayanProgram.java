import java.util.Scanner;
public class Pratik_NotOrtalamasiHesaplayanProgram {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, tarih, muzik;
        Scanner inp = new Scanner(System.in);

        System.out.println("Matematik notunuzu giriniz:");
        mat = inp.nextInt();
        System.out.println("Fizik notunuzu giriniz:");
        fizik = inp.nextInt();
        System.out.println("Kimya notunuzu giriniz:");
        kimya = inp.nextInt();
        System.out.println("Türkçe notunuzu giriniz:");
        turkce = inp.nextInt();
        System.out.println("Tarih notunuzu giriniz:");
        tarih = inp.nextInt();
        System.out.println("Müzik notunuzu giriniz:");
        muzik = inp.nextInt();

        double toplam = (mat+fizik+kimya+tarih+turkce+muzik)/6.0;
        System.out.println("Sonucunuz:");
        System.out.println(toplam);
        //Ödev= 60'ı geçenler geçti, geçmeyenler kaldı
        String durum = toplam>=60? "Geçti" : "Kaldı";
        System.out.println(durum);


    }
}
