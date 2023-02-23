import java.util.Scanner;

public class Pratik_twoPower {
    public static void main(String[] args) {
        int n = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Sınır sayısını giriniz:");
        n = input.nextInt();
        System.out.print("4'ün katları: ");
        for (int i = 1; i <= n; i*=4) {
            System.out.print(i + " ");
            }
        System.out.print("\n"+"5'in katları: ");
        for (int b = 1; b <= n; b*=5) {
            System.out.print(b + " ");
        }
    }
}
