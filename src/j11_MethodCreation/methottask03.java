package j11_MethodCreation;

import java.util.Scanner;

public class methottask03 {
    public static void main(String[] args) {


        // Saati saniyeye, mil'i kilometreye, kilogrami gram'a
        // ceviren bir method yaziniz.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Saati giriniz : ");
        int saat = scanner.nextInt();
        System.out.println("mil girin :");
        int mil=scanner.nextInt();
        System.out.println("kilogram giriniz :");
        int kg=scanner.nextInt();
        System.out.println("mil : ");
        çevir (saat,mil,kg );

    }

    public static void çevir(int s, int k, int m ) {
        double saniye = s * 3600;
        double km = m*1.609344;
        double gr=k*1000;

        System.out.println("" + s + " saat = " + saniye + " saniye\n" + m + " kara mili = " + km + " kilometre\n" + k + " kg = " + gr + " gram");

    }
}