import java.util.Scanner;
public class ifElseElif {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Kredi Miktarı Giriniz:");
        double kredi;
        kredi = input.nextDouble();
        if(kredi > 50) {
            System.out.println("Hello");
        }
        else if (kredi <= 50) {
            System.out.println("Fuckoff");
        }

        int var1 = 5, var2 =6;
        if ((var2 = 1) == var1) {
            System.out.println(var2);
        }
        else  {
            System.out.println(++var2);
        }

    }
}
