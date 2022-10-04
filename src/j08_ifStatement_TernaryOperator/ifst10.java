package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class ifst10 {
    public static void main(String[] args) {

        /* Oluşturulan bu 3 int içinde en yüksek değerli olanı bulun.
         Bu en yüksek numarayı yazdırın.

         Not: Num1 = 18 veya Num2 = 25 değerini değiştirdiğinizde kodunuz maksimum değeri yazmalıdır.
         Tüm farklı senaryolarda maksimum sayıyı yazdırmalıdır  */

        Scanner scan = new Scanner(System.in);
        System.out.println("bir rakam girin : ");
        int i1= scan.nextInt();
        System.out.println("bir rakam daha girin : ");
        int i2= scan.nextInt();
        System.out.println("bir rakam daha giriniz : ");
        int i3= scan.nextInt();

        //Kodu aşağıya yazınız. BU SATIRIN YUKARISINI DEĞİŞTİRMEYİNİZ.

        if (i1>i2 & i1>i3 ) {
            System.out.println("i1");
        }else if (i2>i1 & i2>i3) {
            System.out.println("i2");
        }else if  (i3>i1 & i3>i2) {
            System.out.println("i3");


        }


    }
}
