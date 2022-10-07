import java.util.Scanner;
public class Pratik_KullaniciGirisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String username, password, password2,password3;
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
                System.out.println("\nŞifrenizi sıfırlamak ister misiniz?:");
                System.out.println("\n1-EVET\n2-HAYIR");
                int secim;
                secim = input.nextInt();
                switch (secim){
                    case(1):
                        System.out.println("Yeni şifre giriniz");
                        password2 = input.next();
                        if (password2.equals("123456789")) {
                            System.out.println("Eski şifrenizi girdiniz");
                            System.out.println("Şifrenizi giriniz:");
                            password3 = input.next();
                            if (password3.equals("123456789")){
                                System.out.println("Giriş başarılı");
                            }
                            else {
                                System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                            }
                        }
                        else {
                            System.out.println("Yeni şifreniz oluşturuldu");
                        }
                        break;
                    case(2):
                        System.out.println("Şifre oluşturulamadı");
                }
            }
        }
        else {
            System.out.println("Kullanıcı adınız yanlış");
        }
    }
}
