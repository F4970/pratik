package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C04_TernaryOperator {
    public static void main(String[] args) {

        // TASK-> girilen bir pozitif tamsayının 2 veya daha fazla basamkalı olmasını kontrol eden code create ediniz.

        Scanner scanner=new Scanner(System.in);
        System.out.println("bir sayı girin : ");
        int sayı =scanner.nextInt();
        String sonuc = (sayı>9 ? "sayı iki veya daha fazla basamaklı": "sayı tek basamaklı" );
        System.out.println("sonuc = " + sonuc);
    }


}
