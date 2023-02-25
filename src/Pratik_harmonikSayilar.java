import java.util.Scanner;

public class Pratik_harmonikSayilar {
    public static void main(String[] args) {
        int girilenSayi = 1;
        double toplam = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("N sayısını giriniz:");
        girilenSayi = input.nextInt();
        for (double i = 1; i <= girilenSayi; i++) {
            toplam += 1 / i;
        }
        System.out.println(toplam);
    }
}
