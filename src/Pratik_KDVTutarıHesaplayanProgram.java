import java.util.Scanner;
public class Pratik_KDVTutarıHesaplayanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double tutar, kdv, kdvliTutar, kdvTutarı;
        System.out.println("Tutarı giriniz:");
        tutar = input.nextDouble();
        boolean KdvOran = 0<tutar && 1000>tutar;
        kdv = KdvOran? 0.18 : 0.08;
        System.out.println("KDV Oranı:");
        System.out.println(kdv);
        kdvTutarı = kdv * tutar;
        System.out.println("Toplam KDV Tutarı:");
        System.out.println(kdvTutarı);
        kdvliTutar = kdvTutarı + tutar;
        System.out.println("KDV'li Tutar:");
        System.out.println(kdvliTutar);


}
}
