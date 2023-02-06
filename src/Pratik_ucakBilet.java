import java.util.Scanner;

public class Pratik_ucakBilet {
    public static void main(String[] args) {
        double nTutar, yasindirimli, yasIndirimTutari, toplam, cifteBilet;
        int mesafe, yolculukTipi, yas;
        Scanner input = new Scanner(System.in);
            System.out.println("Yaşınızı giriniz:");
            yas = input.nextInt();
            System.out.println("Mesafeyi giriniz:");
            mesafe = input.nextInt();
            System.out.println("Lütfen seçiniz:" + " " + "1-Tek Bilet" + "\n" + "2-Gidiş Dönüş Bilet");
            yolculukTipi = input.nextInt();
            if ((yolculukTipi == 1 || yolculukTipi == 2) && yas > 0 && mesafe > 0) {
                nTutar = mesafe * 0.10;
                if (yas < 12) {
                    yasIndirimTutari = nTutar * 0.5;
                    yasindirimli = nTutar - yasIndirimTutari;
                    if (yolculukTipi == 2) {
                        cifteBilet = yasindirimli * 0.2;
                        toplam = yasindirimli - cifteBilet;
                        System.out.println(toplam);
                    }
                    else {
                        toplam = yasindirimli;
                        System.out.println(toplam);
                    }
                } else if (yas < 25) {
                    yasIndirimTutari = nTutar * 0.1;
                    yasindirimli = nTutar - yasIndirimTutari;
                    if (yolculukTipi == 2) {
                        cifteBilet = yasindirimli * 0.2;
                        toplam = yasindirimli - cifteBilet;
                        System.out.println(toplam);
                    }
                    else {
                        toplam = yasindirimli;
                        System.out.println(toplam);
                    }
                } else if (yas > 65) {
                    yasIndirimTutari = nTutar * 0.2;
                    yasindirimli = nTutar - yasIndirimTutari;
                    if (yolculukTipi == 2) {
                        cifteBilet = yasindirimli * 0.2;
                        toplam = yasindirimli - cifteBilet;
                        System.out.println(toplam);
                    }
                    else {
                        toplam = yasindirimli;
                        System.out.println(toplam);
                    }
                } else {
                    if (yolculukTipi == 2) {
                        cifteBilet = nTutar * 0.2;
                        toplam = nTutar - cifteBilet;
                        System.out.println(toplam);
                    }
                    else {
                        toplam = nTutar;
                        System.out.println(toplam);
                    }
                }
            }
            else {
                System.out.println("Hatalı giris yaptınız.");
            }
    }
}
