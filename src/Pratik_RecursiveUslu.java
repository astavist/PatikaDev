import java.util.Scanner;

public class Pratik_RecursiveUslu {
    static int uslu(int a,int b) {

        if (b == 1) {
            return a;
        }
        return a*uslu(a,b-1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Taban değeri giriniz: ");
        int a = input.nextInt();
        System.out.println("Üs değeri giriniz: ");
        int b = input.nextInt();
        System.out.println("Sonuç: " + uslu(a,b));
    }
}
