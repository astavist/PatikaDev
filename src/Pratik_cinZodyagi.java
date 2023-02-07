import java.util.Scanner;

public class Pratik_cinZodyagi {
    public static void main(String[] args) {
        int dogumYili ;
        Scanner input = new Scanner(System.in);
        System.out.println("Doğduğunuz yılı giriniz:");
        dogumYili = input.nextInt();
        if (dogumYili % 12 == 0) {
            System.out.println("Çin zodyağınız: Maymun" );
        }
        if (dogumYili % 12 == 1) {
            System.out.println("Çin zodyağınız: Horoz " );
        }
        if (dogumYili % 12 == 2) {
            System.out.println("Çin zodyağınız: Köpek " );
        }
        if (dogumYili % 12 == 3) {
            System.out.println("Çin zodyağınız: Domuz " );
        }
        if (dogumYili % 12 == 4) {
            System.out.println("Çin zodyağınız: Fare " );
        }
        if (dogumYili % 12 == 5) {
            System.out.println("Çin zodyağınız: Öküz " );
        }
        if (dogumYili % 12 == 6) {
            System.out.println("Çin zodyağınız: Kaplan " );
        }
        if (dogumYili % 12 == 7) {
            System.out.println("Çin zodyağınız: Tavşan " );
        }
        if (dogumYili % 12 == 8) {
            System.out.println("Çin zodyağınız: Ejderha " );
        }
        if (dogumYili % 12 == 9) {
            System.out.println("Çin zodyağınız: Yılan " );
        }
        if (dogumYili % 12 == 10) {
            System.out.println("Çin zodyağınız: At " );
        }
        if (dogumYili % 12 == 11) {
            System.out.println("Çin zodyağınız: Koyun " );
        }
    }
}
