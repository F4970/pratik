package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class ifst11 {
    public static void main(String[] args) {
        /*    Oluşturulan bu 3 int arasında en düşük değerdeki numarayı bulunuz.
          Bu numarayı yazdırınız.
          Not: Kodunuz her farklı senaryoda en küçük numarayı yazdırmalıdır.

          Örn: 10-11-12 > 10  */


        Scanner scan = new Scanner(System.in);
        System.out.println("bir değer girin : ");
        int i1 = scan.nextInt();
        System.out.println("bir değer daha girin : ");
        int i2 = scan.nextInt();
        System.out.println("bir değer daha girin : ");
        int i3 = scan.nextInt();

        //Kodu aşağıya yazınız. BU SATIRIN YUKARISINI DEĞİŞTİRMEYİNİZ.

        if (i1<i2 &i1<i3) {
            System.out.println("i1");
        } else if (i2 <i1 & i2<i3) {
            System.out.println("i2");
        }else if (i3 <i1 & i3 <i2) {
            System.out.println("i3");

        }
    }
}
