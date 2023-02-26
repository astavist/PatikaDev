import java.util.Scanner;

public class Odev_minMaxSayi {
    public static void main(String[] args) {
        int sayi, a, max = 0, min = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Kaç sayı gireceksiniz: ");
        sayi = input.nextInt();
        for (int i = 0; i < sayi; i++) {
            System.out.println((i+1) + ". sayıyı giriniz:");
            a = input.nextInt();
            if (sayi == 1) {
                min = a;
                max = a;
            }
            if (a>max) {
                max = a;
            }
            if (a<min) {
                min = a;
            }
        }
        System.out.println("En büyük sayı: " + max);
        System.out.println("En küçük sayı: " + min);
    }
}
