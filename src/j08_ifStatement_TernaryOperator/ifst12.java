package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class ifst12<hız> {
    public static void main(String[] args) {

        /* Trafik cezasının değerini hesaplayın.
        45 hız sınırıdır.

        Eğer hızınız 55-74 arasında ise:
        Ceza 100 $'dır.

        Eğer hızınız 75 - 84 arasında ise:
        Ceza 150 $'dır.

        Eğer hızınız 85 -94 arasında ise:
        Ceza 320 $'dır.

        Eğer hızınız 94'den daha fazla ise:
        Ceza 500 $'dır.

        ve ayrıca,
        Eğer sürücünün ehliyeti yoksa cezaya 200 $ eklenir.

        Örn: Hızınız 77 iken cezanız 150$'dır ama ehliyetiniz yoksa ceza 350 $ olur.


       */
        Scanner scanner = new Scanner(System.in);
        int hız = scanner.nextInt();
        char ehliyet=scanner.next().charAt(0);
        ehliyet =(200);

        if (hız < 46) {
        System.out.println("hız sınırınız normal ");
        }else if (hız>54 || hız<73  ) {
            System.out.println(" 100 $ ödeyiniz");
        }else if (hız >74 || hız <85) {
            System.out.println(" 150 $ ödeyiniz ");
        } else if (hız >84 || hız <95) {
            System.out.println(" 320 $ ödeyiniz ");
        }else if (hız >94) {
            System.out.println( "500 $ ödeyiniz ");

        }


    }
}
