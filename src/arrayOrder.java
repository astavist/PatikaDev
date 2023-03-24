import java.util.Scanner;

public class arrayOrder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Dizinin boyutu n : ");
        int n = input.nextInt();
        int[] sayilar = new int[n];
        int index = 0;

        System.out.println("Dizinin elemanlarını giriniz: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(i +  ". Eleman: ");
            int e = input.nextInt();
            sayilar[index++] = e;
        }

        insertionSort(sayilar);

        for (int sayi: sayilar) {
            System.out.print(sayi + " ");
        }
    }

    private static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i - 1;

            while(j >= 0 && array[j] > temp) {
                array[j + 1] = array[j];
                j--;
            }

            array[j + 1] = temp;
        }
    }
}
