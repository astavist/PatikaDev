package org.example;

public class Recursive {
//    kendini çağıran metodlar
    static int f(int n) {
        System.out.println(n);;
        if (n == 1) {
            return 1;
        }
        int result = f(n-1) + n;
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        f(4);
    }

}
