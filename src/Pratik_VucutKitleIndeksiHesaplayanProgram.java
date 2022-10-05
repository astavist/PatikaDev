import java.util.Scanner;
public class Pratik_VucutKitleIndeksiHesaplayanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double kilo, boy, vücutKitleEndeksi;
        System.out.println("Kilonuzu giriniz(Örn. 102,3):");
        kilo = input.nextDouble();
        System.out.println("Boyunuzu giriniz(Örn. 1,75):");
        boy = input.nextDouble();
        vücutKitleEndeksi = kilo / (boy * boy);
        System.out.println("Vücut Kitle İndeksiniz:");
        System.out.println(vücutKitleEndeksi);
    }
}
