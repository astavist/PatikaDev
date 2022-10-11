import java.util.Scanner;
public class MantiksalOperatorler {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double not;
        not = input.nextDouble();
        System.out.println(not > 45 ? "Geçti" : "Kaldı");

        boolean a = true, b = false;
        System.out.println((a && b || ( a || b)));


    }
}
