package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C03_TernaryOperator {

    public static void main(String[] args) {

        /* Ternary ile yapilan tum islemler if-else blok ile de yapilabilir
 ternary tercih edilmesi yapinin basit okunabilir ve anlasilabilir olmasi içindir -> clean code
 Ternary icerisinde kompleks kodlar yerine dogrudan sonuç üreten veya sonucu veren
 daha basic code'lar bulunur.

 */
        // TASK01 -> girilen bir tamsayının tek-çift olmasını kontrol eden code create ediniz.

        Scanner scanner=new Scanner(System.in);
        System.out.println("bir tamsayı girin :");
        int sayı=scanner.nextInt();
        if (sayı%2==0) {
            System.out.println("sayı çift");
        }else {
            System.out.println("sayı tek");
        }
        System.out.println("*** ternary çozumu ***");
        String sonuc= (sayı%2==0 ? "sayı çift " : "sayı tek");
        System.out.println("sonuc = " + sonuc);

        /*
        TRICK : ternary operator işlem sonunda true veya false göre bir çıktı verir
        eğer bu çıktı type göre bir veriable atanmazsa sout ile doğrudan print edilmeli.
         */

        // girilen bir tamsayının negatif olmasını kontrol eden code create ediniz
        String sonuc1=(sayı<0 ? "sayı negatif ": "sayı pozitif ");
        System.out.println("sonuc1 = " + sonuc1);
    }
}
