import java.util.Scanner;

public class Pratik_tersUcgen {
    public static void main(String[] args) {
        int sayi;
        Scanner input = new Scanner(System.in);
        sayi = input.nextInt();
        for (int i = 0; i < sayi; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("a");
            }
            for (int k = 0; k < 2 * sayi - (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
