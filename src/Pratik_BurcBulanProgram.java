import java.util.Scanner;
public class Pratik_BurcBulanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int month, day;
        System.out.println("Doğduğunuz ayı giriniz:");
        month = input.nextInt();
        System.out.println("Doğduğunuz günü giriniz:");
        day = input.nextInt();
        switch (month) {
            case 1:
                if (day <= 21 && day >= 1) {
                    System.out.println("Oğlak Burcusunuz");
                }
                else if (day <= 31 && day > 21) {
                    System.out.println("Kova Burcusunuz");
                }
                else {
                    System.out.println("Hatalı gün girdiniz");
                }
            break;
            case 2:
                if (day <= 19 && day >= 1) {
                    System.out.println("Kova Burcusunuz");
                }
                else if (day <= 28 && day > 19) {
                    System.out.println("Balık Burcusunuz");
                }
                else {
                    System.out.println("Hatalı gün girdiniz");
                }
            break;
            case 3:
                if (day <= 20 && day >= 1) {
                    System.out.println("Balık Burcusunuz");
                }
                else if (day <= 31 && day > 20) {
                    System.out.println("Koç Burcusunuz");
                }
                else {
                    System.out.println("Hatalı gün girdiniz");
                }
            break;
            case 4:
                if (day <= 20 && day >= 1) {
                    System.out.println("Koç Burcusunuz");
                }
                else if (day <= 30 && day > 20) {
                    System.out.println("Boğa Burcusunuz");
                }
                else {
                    System.out.println("Hatalı gün girdiniz");
                }
            break;
            case 5:
                if (day <= 21 && day >= 1) {
                    System.out.println("Boğa Burcusunuz");
                }
                else if (day <= 31 && day > 20) {
                    System.out.println("İkizler Burcusunuz");
                }
                else {
                    System.out.println("Hatalı gün girdiniz");
                }
            break;
            case 6:
                if (day <= 22 && day >= 1) {
                    System.out.println("İkizler Burcusunuz");
                }
                else if (day <= 30 && day > 20) {
                    System.out.println("Yengeç Burcusunuz");
                }
                else {
                    System.out.println("Hatalı gün girdiniz");
                }
            break;
            case 7:
                if (day <= 23 && day >= 1) {
                    System.out.println("Yengeç Burcusunuz");
                }
                else if (day <= 31 && day > 20) {
                    System.out.println("Aslan Burcusunuz");
                }
                else {
                    System.out.println("Hatalı gün girdiniz");
                }
            break;
            case 8:
                if (day <= 23 && day >= 1) {
                    System.out.println("Aslan Burcusunuz");
                }
                else if (day <= 31 && day > 20) {
                    System.out.println("Başak Burcusunuz");
                }
                else {
                    System.out.println("Hatalı gün girdiniz");
                }
            break;
            case 9:
                if (day <= 23 && day >= 1) {
                    System.out.println("Başak Burcusunuz");
                }
                else if (day <= 30 && day > 20) {
                    System.out.println("Terazi Burcusunuz");
                }
                else {
                    System.out.println("Hatalı gün girdiniz");
                }
            break;
            case 10:
                if (day <= 23 && day >= 1) {
                    System.out.println("Terazi Burcusunuz");
                }
                else if (day <= 31 && day > 20) {
                    System.out.println("Akrep Burcusunuz");
                }
                else {
                    System.out.println("Hatalı gün girdiniz");
                }
            break;
            case 11:
                if (day <= 21 && day >= 1) {
                    System.out.println("Akrep Burcusunuz");
                }
                else if (day <= 30 && day > 20) {
                    System.out.println("Yay Burcusunuz");
                }
                else {
                    System.out.println("Hatalı gün girdiniz");
                }
            break;
            case 12:
                if (day <= 21 && day >= 1) {
                    System.out.println("Yay Burcusunuz");
                }
                else if (day <= 31 && day > 20) {
                    System.out.println("Oğlak Burcusunuz");
                }
                else {
                    System.out.println("Hatalı gün girdiniz");
                }
            break;
        }
    }
}
