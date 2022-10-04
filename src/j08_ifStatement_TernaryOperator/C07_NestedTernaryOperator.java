package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C07_NestedTernaryOperator {
    public static void main(String[] args) {


        /*
TASK :
 Girilrn bir pozitif tamsayı pozitif tamsayı 4 basamaklı ise  "4 Basamaklı" print eden
 4 basamaklı degilse çift olup olmadigini kontrol edip. Çift ise "4 basamaklı olmayan çift sayı" yazdırın.
 Çift sayı degilse "4 basamaklı olmayan tek sayı yazdırın."
 */
        Scanner scanner = new Scanner(System.in);
        System.out.println("bir sayı girin : ");
        int sayı = scanner.nextInt();

        System.out.println(((sayı>999 && sayı<10000) ? "4 basamaklı ":sayı%2==0 ? "4 basamaklı çift olmayan sayı ":"4 basamaklı olmayan sayı" ));
    }
}
