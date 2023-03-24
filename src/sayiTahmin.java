import java.util.Random;
import java.util.Scanner;

public class sayiTahmin {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100);

        Scanner input =new Scanner(System.in);
        int right = 0;
        int selected;
        int[] wrong = new int[5];
        while (right<5){
            System.out.println("Enter number : ");
            selected = input.nextInt();
            wrong[right++] = selected;
            if (selected<0 || selected>99){
                System.out.println("incorrect number. Please select 0-99 range: ");
                continue;
            }
            if (selected == number){
                System.out.println(" Good , you select right number. ");
                break;
            }
            if (selected<number){
                System.out.println(selected + " is smaller than number. Please select greater one : ");
            }else{
                System.out.println(selected + " is greater than number. Please select smaller one : ");
            }
            System.out.println("your right is : " + (5-right));

        }
        if (right==5){
            System.out.println("Failed !!! ");
            System.out.println("Number was :" + number);
        }
    }
}
