import java.util.Scanner;

public class Pratik_yildizCizme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, islem = 1;
        System.out.println("Bir sayı giriniz:");
        n = input.nextInt();
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < (n-i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2*i+1; k++) {
                System.out.print("*");
            }
            System.out.println(" ");
            islem++;
        }
        for (int i = n-1; i >= 0 ; i--) {
            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2*i+1; k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
