import java.util.Scanner;

public class PratikMukemmelSayi {
    public static void main(String[] args) {
        int sayi,toplam=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Sayıyı giriniz:");
        sayi = input.nextInt();
        for (int i=1; i<sayi;i++) {
            if (sayi%i==0) {
                toplam += i;
            }
        }
        System.out.println(toplam);
        if (toplam==sayi) {
            System.out.println(sayi + " mükemmel sayıdır.");
        }
        else {
            System.out.println(sayi + " mükemmel sayı değildir.");
        }

    }

}
