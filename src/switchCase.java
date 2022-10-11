import java.util.Scanner;
public class switchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x;
        System.out.println("Kaçıncı gündeyiz?:");
        x = input.nextInt();
        switch (x) {
            case(1):
                System.out.println("Pazartesi");
                break;
            case(2):
                System.out.println("Salı");
                break;
            case(3):
                System.out.println("Çarşamba");
                break;
            case(4):
                System.out.println("Perşembe");
                break;
            case(5):
                System.out.println("Cuma");
                break;
            case(6):
                System.out.println("Cumartesi");
                break;
            case(7):
                System.out.println("Pazar");
                break;
            default:
                System.out.println("Bilmiyorum");

        }
        int points=6;
        switch(points)
        {
            case 6: ;
            case 7: System.out.println("Java");break;
            case 8: ;
            case 9: System.out.println("101");break;
            case 10: System.out.println("Patika"); break;
            default: System.out.println("Dev");
        }




    }
}
