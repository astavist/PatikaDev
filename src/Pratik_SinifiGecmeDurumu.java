import java.util.Scanner;
public class Pratik_SinifiGecmeDurumu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mat, fizik, turkce, kimya, muzik, toplamNot = 0, toplamDers = 0;
        System.out.println("Matematik notunuzu giriniz:");
        mat = input.nextInt();
        if ((mat>100) || (mat<0)) {
        }
        else {
            toplamNot += mat;
            toplamDers++;
        }
        System.out.println("Fizik notunuzu giriniz:");
        fizik = input.nextInt();
        if ((fizik>100) || (fizik<0)) {
        }
        else {
            toplamNot += fizik;
            toplamDers++;
        }
        System.out.println("Türkçe notunuzu giriniz:");
        turkce = input.nextInt();
        if ((turkce>100) || (turkce<0)) {
        }
        else {
            toplamNot += turkce;
            toplamDers++;
        }
        System.out.println("Kimya notunuzu giriniz:");
        kimya = input.nextInt();
        if ((kimya>100) || (kimya<0)) {
        }
        else {
            toplamNot += kimya;
            toplamDers++;
        }
        System.out.println("Müzik notunuzu giriniz:");
        muzik = input.nextInt();
        if ((muzik>100) || (muzik<0)) {
        }
        else {
            toplamNot += muzik;
            toplamDers++;
        }
        double average;
        System.out.println(average = toplamNot / toplamDers);
        if (average >= 55){
            System.out.println("Geçti");
        }
        else {
            System.out.println("Kaldı");
        }
        }
    }
