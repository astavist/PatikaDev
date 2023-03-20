public class Pratik_AsalSayi {
    public static void main(String[] args) {
        int a=100,asal=0;
        for (int i=2;i<=a;i++){
            for (int j=2;j<=i;j++) {
                if (i!=j && i%j==0) {
                    asal=0;
                    break;
                }
                else {
                    asal=i;
                }
            }
            if (asal!=0) {
                System.out.println(asal + " sayısı asaldır");
            }
            asal=0;
        }
    }
}
