import java.util.Scanner;
public class Pratik_HesapMakinesi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b;
        int select;
        System.out.println("Birinci sayıyı giriniz:");
        a = input.nextInt();
        System.out.println("İkinci sayıyı giriniz:");
        b = input.nextInt();
        System.out.println("\n 1-Toplama \n 2-Çıkarma \n 3-Çarpma \n 4-Bölme");
        System.out.println("Seçiminiz nedir?:");
        select = input.nextInt();
        switch (select) {
            case (1):
                System.out.println(a+b);
                break;
            case (2):
                System.out.println(a-b);
                break;
            case (3):
                System.out.println(a*b);
                break;
            case (4):
                if (b == 0) {
                    System.out.println("bir sayı sıfıra bölünemez");
            }
                else {System.out.println(a/b);}
                break;
            default:
                System.out.println("yanlış seçim");
        }

    }
}
