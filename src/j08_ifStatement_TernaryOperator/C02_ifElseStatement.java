package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C02_ifElseStatement {
    public static void main(String[] args) {

        /*
TASK-> girilen yasın 18 den buyuklugunu kontrol eden code create ediniz
 */
        Scanner scanner = new Scanner(System.in);
        System.out.println("yaşınızı giriniz : ");

        int yas = scanner.nextInt();
        if (yas > 18) {
            System.out.println("yaşınız 18 den buyuk ");

 /*
TASK-> girilen yasın 18 den buyuklugunu kontrol eden code create ediniz
18 den kucuk ise ehliyet alamazsınız print
 */
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("yaşınız : ");

            int yaş = scanner1.nextInt();
            if (yaş >= 18) {// girilen yaşın 18 den büyük ve eşit olmasını kontrol eder
                System.out.println("ehliyet almak için yaşınız uygun");

            } else System.out.println("ehliyet alamazsınız"); //if şartı sağlamazsa

        }


    }
}





