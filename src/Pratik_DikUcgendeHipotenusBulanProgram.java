import java.util.Scanner;
public class Pratik_DikUcgendeHipotenusBulanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hipotenüs Bulma Programına Hoşgeldiniz");
        double kısaKenar1, kısaKenar2, hipotenus;
        System.out.println("1.Kısa Kenarı Giriniz:");
        kısaKenar1 = input.nextDouble();
        System.out.println("2.Kısa Kenarı Giriniz:");
        kısaKenar2 = input.nextDouble();
        hipotenus = Math.sqrt((kısaKenar1 * kısaKenar1) + (kısaKenar2 * kısaKenar2));
        System.out.println("Hipotenüs:");
        System.out.println(hipotenus);

        //Ödev = Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.
        //Formül
        //Üçgenin çevresi = 2𝑢
        //𝑢 = (a+b+c) / 2
        //Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
        System.out.println("\n");
        System.out.println("Kenarları Bilinen Üçgenin Alanını Hesaplama Programına Hoşgeldiniz");

        double a, b, c, u, alan, cevre;
        System.out.println("1.Kenarı Giriniz:");
        a = input.nextDouble();
        System.out.println("2.Kenarı Giriniz:");
        b = input.nextDouble();
        System.out.println("3.Kenarı Giriniz:");
        c = input.nextDouble();
        u = (a+b+c)/2;
        System.out.println("u:");
        System.out.println(u);
        alan = Math.sqrt(u * (u-a) * (u-b) * (u-c));
        System.out.println("Üçgenin Alanı:");
        System.out.println(alan);
        cevre = a+b+c;
        System.out.println("Üçgenin Çevresi");
        System.out.println(cevre);



        }
}
