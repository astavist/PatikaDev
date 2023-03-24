public class palindromik {
    static boolean isPalindromik(String str) {
        String reverse = "";

        for(int i=str.length()-1; i>=0; i--) {
            reverse += str.charAt(i);
        }
        return str.equals(reverse);
    }

    public static void main(String[] args) {

        if(isPalindromik("kayak")) { // true ise if çalışır, false ise else çalışır.
            System.out.println("Palindromik Kelime");
        }else
            System.out.println("Palindromik Kelime Değil");


    }
}
