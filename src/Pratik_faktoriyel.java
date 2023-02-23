import java.util.Scanner;

public class Pratik_faktoriyel {
    public static void main(String[] args) {
        int a , b ,faktoA = 1, faktoB = 1,faktoC =1, kombi;
        Scanner input = new Scanner(System.in);
            System.out.println("kümedeki eleman sayısını giriniz:");
            a = input.nextInt();
            System.out.println("kümeden seçilecek eleman sayısını giriniz:");
            b = input.nextInt();
            for (int i = 1; i <= a; i++) {
                faktoA *= i;
            }
           //System.out.println(faktoA); //kontrol
            for (int i = 1; i <= b; i++) {
                faktoB *= i;
            }
            //System.out.println(faktoB); //kontrol
            for (int i = 1; i <= (a - b); i++) {
                faktoC *= i;
            }
            //System.out.println(faktoC); //kontrol
            kombi = faktoA / (faktoB * faktoC);
            System.out.println(a + " sayısının " + b + " ile kombinasyonu: " + kombi);
    }
}
