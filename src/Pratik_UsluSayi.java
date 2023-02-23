import java.util.Scanner;

public class Pratik_UsluSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            int a, b, uslu = 1;
            System.out.println("Üssü alınacak sayı:");
            a = input.nextInt();
            System.out.println("Üs olacak sayı");
            b = input.nextInt();
            for (int i = 1; i <= b; i++) {
                uslu *= a;
            }
            System.out.println("Sonuç: " + uslu);
    }
}
