import java.util.Scanner;
public class Pratik_DaireAlanıCevresiHesaplayanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double 𝜋 = 3.14, r, alan, cevre;
        System.out.println("Yarı çapı giriniz:");
        r = input.nextDouble();
        alan = 𝜋 * r * r;
        System.out.println("Dairenin Alanı:");
        System.out.println(alan);
        cevre = 2 * 𝜋 * r;
        System.out.println("Dairenin Çevresi:");
        System.out.println(cevre);
        /* Ödev
        Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
        Formül : (𝜋 * (r*r) * 𝛼) / 360 */
        double r2, a,daireAlan;
        System.out.println("Yarı çapı giriniz:");
        r2 = input.nextDouble();
        System.out.println("Açıyı giriniz:");
        a = input.nextDouble();
        daireAlan = (𝜋 * (r * r) * a) / 360;
        System.out.println("Daire Dilimi Alanı");
        System.out.println(daireAlan);




    }
}
