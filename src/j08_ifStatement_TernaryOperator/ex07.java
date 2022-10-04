package j08_ifStatement_TernaryOperator;

import java.util.Locale;
import java.util.Scanner;

public class ex07<ehliyet> {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("ehliyetiniz var ise E yok ise H girin : ");
        char ehliyet = scanner.next().toUpperCase().charAt(0);
        if (ehliyet == 'E') {
            System.out.println("kaç yıllık tecrübeniz var :");
            int tecrübe = scanner.nextInt();
            if (tecrübe >= 7) {
            } else System.out.println("kontak almanız için önce :" + (7 - tecrübe) + "yıla ihtiyacınız var");
        }


    }
}

