import java.util.Scanner;

public class Pratik_EBOB_EKOK {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            int n1, n2, buyuk, EBOB = 1, EKOK;
            System.out.println("n1 sayısını giriniz: ");
            n1 = input.nextInt();
            System.out.println("n2 sayısını giriniz: ");
            n2 = input.nextInt();
            if (n1 < n2) {
                buyuk = n2;
            }
            else {
                buyuk = n1;
            }

            for (int i = 1; i < buyuk; i++)
                if (n1 % i == 0 && n2 % i == 0) {
                    EBOB = i;
                }
            EKOK = (n2*n1) / EBOB;
            System.out.println("EBOB: " + EBOB + "\n" + "EKOK: " + EKOK );
    }
}
