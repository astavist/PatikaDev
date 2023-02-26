import java.util.Scanner;
public class Pratik_ATM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int right = 3, islem = 1;
        int balance = 1500;
        int price;
        while (right > 0) {
            String userName , password;
            System.out.println("Kullanıcı Adınız :");
            userName = input.nextLine();
            System.out.println("Parolanız : ");
            password = input.nextLine();
            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");
                while (islem != 4) {
                    System.out.println("1-Para yatırma \n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap");
                    System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz: ");
                    islem = input.nextInt();
                    switch (islem) {
                        case 1:
                            System.out.print("Para miktarı : ");
                            price = input.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.print("Para miktarı : ");
                            price = input.nextInt();
                            if (price > balance) {
                                System.out.println("Bakiye yetersiz."); }
                            else {
                                balance -= price; }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz : " + balance);
                            break;
                        case 4:
                            System.out.println("Tekrar görüşmek üzere.");
                            right = 0;
                            break;
                    }
                }
            }
            else {
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                } else {
                    System.out.println("Kalan Hakkınız : " + right);
                }
            }
        }
    }
}
