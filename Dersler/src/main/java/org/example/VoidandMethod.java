package org.example;

public class VoidandMethod {
    static void sum(int a,int b) {
        int result = a + b;
        System.out.println(result);
    }
    static int run(int a, int b) {
        int result = a + b;
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        sum(5,2);
        run(5,6);

    }
}
