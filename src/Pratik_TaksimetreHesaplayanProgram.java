import java.util.Scanner;
public class Pratik_TaksimetreHesaplayanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*Taksimetre Programı
        Taksimetre KM başına 2.20 TL tutmaktadır.
        Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
        Taksimetre açılış ücreti 10 TL'dir. */

        double gidilen,yolUcret,ucret,son;
        System.out.println("Gidilen Mesafeyi Giriniz:");
        gidilen = input.nextDouble();
        yolUcret = gidilen * 2.2;
        ucret = yolUcret + 10;
        Boolean min = ucret>20;
        son = min? ucret : 20;
        System.out.println("Taksi Ücreti:");
        System.out.println(son);





    }
}
