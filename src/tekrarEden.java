import java.util.Arrays;
import java.util.Scanner;

public class tekrarEden {
    public static void main(String[] args) {
        int[] sayi = {3,3,6,2,1,1,4,5} ;
        Arrays.sort(sayi);
        int count = 0;
        int backNumber=0;
        for (int i = 0; i < sayi.length; i++) {
            for (int j=0;j< sayi.length;j++) {
                if (i!=j && sayi[i] == sayi[j]) {
                    System.out.println(sayi[j]);
                    i++;
                }
            }

        }
    }
}
