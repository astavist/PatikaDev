package org.example;
public class Overloading {
    static void print() {
        System.out.println("merhaba");
    }
    static void print(int a) {
        System.out.println("selam " + a);
    }

    public static void main(String[] args) {
        print(); //burda iki aynı method farklı hallerde birbirine overload yapıyor
        print(3);
    }
}
