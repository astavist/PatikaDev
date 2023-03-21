import java.util.Scanner;

public class Pratik_GelismisHesapMak {
    static int sum() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz : ");
        int a = scan.nextInt();
        System.out.print("İkinci sayıyı giriniz : ");
        int b = scan.nextInt();
        int result = a + b;
        System.out.println("Toplama sonucu: " + result);
        return result;
    }

    static int minus() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz : ");
        int a = scan.nextInt();
        System.out.print("İkinci sayıyı giriniz : ");
        int b = scan.nextInt();
        int result = a - b;
        System.out.println("Çıkarma sonucu: " + result);
        return result;
    }

    static int times() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz : ");
        int a = scan.nextInt();
        System.out.print("İkinci sayıyı giriniz : ");
        int b = scan.nextInt();
        int result = a * b;
        System.out.println("Çarpma sonucu: " + result);
        return result;
    }

    static void divided() {
        Scanner scan = new Scanner(System.in);
        double result = 0;
        System.out.print("Birinci sayıyı giriniz : ");
        double a = scan.nextInt();
        System.out.print("İkinci sayıyı giriniz : ");
        int b = scan.nextInt();
        if (b == 0) {
            System.out.println("İkinci değer sıfır olamaz");

        } else {
            result = a / b;
            System.out.println("Bölme sonucu: " + result);
        }
    }

    static int power() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban sayısını giriniz : ");
        int a = scan.nextInt();
        System.out.print("Üs sayısını giriniz : ");
        int b = scan.nextInt();
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        System.out.println("Üs alma sonucu: " + result);
        return result;
    }

    static int factorial() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Faktoriyel sayısını giriniz : ");
        int n = scan.nextInt();
        int result = 1;
        if (n == 0) {
            return 1;
        }
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        System.out.println("Faktoriyel sonucu : " + result);
        return result;
    }

    static int mod() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz : ");
        int a = scan.nextInt();
        System.out.print("İkinci sayıyı giriniz : ");
        int b = scan.nextInt();
        int result = a % b;
        System.out.println("Mod sonucu: " + result);
        return result;
    }

    static void calc() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Birinci kenar giriniz : ");
        int a = scan.nextInt();
        System.out.print("İkinci kenarı giriniz : ");
        int b = scan.nextInt();
        System.out.println("Çevresi : " + (2 * (a + b)));
        System.out.println("Alanı : " + (a * b));
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String menu = "1- Toplama İşlemi\n" +
                "2- Çıkarma İşlemi\n" +
                "3- Çarpma İşlemi\n" +
                "4- Bölme işlemi\n" +
                "5- Üslü Sayı Hesaplama\n" +
                "6- Faktoriyel Hesaplama\n" +
                "7- Mod Alma\n" +
                "8- Dikdörtgen Alan ve Çevre Hesabı";
        System.out.println(menu);
        while (true) {
            System.out.print("Bir işlem seçiniz:");
            int select = scan.nextInt();
            if (select == 0) {
                break;
            }

            switch (select) {
                case 1:
                    sum();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    calc();
                    break;
                default:
                    System.out.println("Geçersiz işlem girdiniz");
            }
        }
    }
}
