import java.util.Scanner;
public class Pratik_KullaniciGirisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String username, password;
        System.out.println("Kullanıcı adınızı giriniz:");
        username = input.nextLine();


        if(username.equals("benkullanici")) {
            System.out.println("Şifrenizi giriniz");
            password = input.nextLine();
            if(password.equals("123456789")){
                System.out.println("Giriş başarılı");
            }
            else {
                System.out.println("Şifreniz yanlış");
                System.out.println("\nŞifrenizi giriniz:");
                password = input.nextLine();
                if(password.equals("123456789")){
                    System.out.println("Giriş başarılı");
                }
                else {
                    System.out.println("Şifreniz yanlış");
                    System.out.println("\nŞifrenizi giriniz");
                    if(password.equals("123456789")){
                        System.out.println("Giriş başarılı");
                    }
                    else {
                        System.out.println("Çok fazla hatalı giriş yaptınız");
                    }
                }
            }
        }
        else {
            System.out.println("Kullanıcı adınız yanlış");
        }
    }
}
