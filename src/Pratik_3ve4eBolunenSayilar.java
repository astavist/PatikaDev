import java.util.Scanner;

public class Pratik_3ve4eBolunenSayilar {
    public static void main(String[] args) {
        int sayi,toplam= 0;
        Scanner input = new Scanner(System.in);
        System.out.println("\n" + "Çift ve 4'e bölünebilen sayıların toplayan programa hoş geldiniz." + "\n");
        do {
            System.out.println("Lütfen sayıyı giriniz :");
            sayi = input.nextInt();
            if (sayi % 2 == 0) {
                if (sayi % 4 == 0) {
                    toplam += sayi;}
                System.out.println("Toplam: " + toplam);
            }
        }
        while (sayi % 2 == 0);
        System.out.println("Toplam: " + toplam);

    }
}
