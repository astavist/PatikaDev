import java.util.Scanner;

public class Pratik_fibonacci {
    public static void main(String[] args) {
        int sayi,a=0,b=1,c;
        Scanner input = new Scanner(System.in);
        System.out.println("Kaç elemanlı fibonacci dizisi istediğinizi giriniz: ");
        sayi = input.nextInt();
        for (int i=0;i<=sayi;i++) {
            c=a+b;
            System.out.println(a);
            a=b;
            b=c;
        }
    }
}
