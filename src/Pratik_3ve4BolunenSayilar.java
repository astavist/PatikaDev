import java.util.Scanner;
public class Pratik_3ve4BolunenSayilar {
    public static void main(String[] args) {
        int sayi;
        System.out.println("Sayıyı giriniz:");
        Scanner input = new Scanner(System.in);
        sayi = input.nextInt();
        System.out.println("3 ve 4'e Tam Bölünen Sayılar:");
        for (int i = 1; i < sayi; i++) {
            if (i%3 == 0){
                if (i%4 == 0) {
                    System.out.println(i + " ");
                }

            }
        }
    }
}
