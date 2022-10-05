import java.util.Scanner;
public class Odev_ManavKasaProgramı {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.00, toplam, kilo;
        System.out.println("Armut kaç kilo?");
        kilo = input.nextDouble();
        toplam = armut * kilo;
        System.out.println("Elma kaç kilo?");
        kilo = input.nextDouble();
        toplam += armut * kilo;
        System.out.println("Domates kaç kilo?");
        kilo = input.nextDouble();
        toplam += armut * kilo;
        System.out.println("Muz kaç kilo?");
        kilo = input.nextDouble();
        toplam += armut * kilo;
        System.out.println("Patlıcan kaç kilo?");
        kilo = input.nextDouble();
        toplam += armut * kilo;
        System.out.println("Toplam tutar:" + toplam + "TL");
    }
}
