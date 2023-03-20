import java.util.Scanner;

public class Pratik_asalSayilar {
    public static void main(String[] args) {
        int number,divide=1;
        Scanner input = new Scanner(System.in);
        System.out.println("Sayıyı giriniz: ");
        number = input.nextInt();
        for (int i = 2; i < number; i++) {
            if (number%i == 0) {
                divide = i;
                System.out.println("Bölenler: " + i);
            }
        }

        if (divide != 1) {
            System.out.println(number + " sayısı asal sayı değildir.");
        }
        else {
            System.out.println(number + " sayısı asal sayıdır.");
        }



    }
}
