import java.util.Scanner;

public class Pratik_armstrongSayilar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int girilenSayi, islem, sayiCounter = 0, basamak = 0, toplam = 0;
        System.out.println("Sayıyı giriniz:");
        girilenSayi = input.nextInt();
        islem = girilenSayi;
        while (islem != 0) {
            basamak = islem % 10;
            islem /= 10;
            toplam += basamak;
            sayiCounter++;
        }
        System.out.println(girilenSayi + " sayısının basamakları toplamı: " + sayiCounter);
        System.out.println(girilenSayi + " sayısının basamakları toplamı: " + toplam);

        //buradan sonrası armstrong sayı olup olmadığına bakmak için

        int armstrong = 0, uslu = 1;
        islem = girilenSayi;
        while (islem != 0) {
            basamak = islem % 10;
            for (int i = 1; i <= sayiCounter; i++) {
                if (uslu == 0) {
                    uslu = 1;
                }
                uslu *= basamak;
            }
            armstrong += uslu;
            islem /= 10;
        }
        if (armstrong == girilenSayi) {
            System.out.println(girilenSayi + " bir armstrong sayıdır.");
        }
        else {
            System.out.println(girilenSayi + " sayısı bir armstrong sayısı değildir.");
        }
    }
}
