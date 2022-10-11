import java.util.Scanner;
public class Pratik_HavaSicakliginaGoreEtkinlikOnerenProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sicaklik;
        System.out.println("Sıcaklık Değerini Giriniz(örn:23):");
        sicaklik = input.nextInt();
        if (sicaklik < 5) {
            System.out.println("Kayak Yapabilirsiniz");
        }
        if (sicaklik >= 5 && sicaklik<15) {
            System.out.println("Sinemaya Gidebilirsiniz");
        }
        if (sicaklik >= 15 && sicaklik<25) {
            System.out.println("Piknik Yapabilirsiniz");
        }
        if (sicaklik >= 25) {
            System.out.println("Yüzmeye Gidebilirsiniz");

        }
    }
}

