package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C05_ternaryOperator {

    public static void main(String[] args) {

        //TASK: girilen bir tamsayı çiftse yarısını değilse "girilen sayı tek oldugu için yarısı tamsayı değildir"
        // print eden code create ediniz

        Scanner scanner=new Scanner(System.in);
        System.out.println("bir sayı girin : ");
        int sayı=scanner.nextInt();


        System.out.println(sayı%2==0 ? sayı/2: "girilen sayı tek olduğu için yarısı tamsayı değildir");


        /*TRICK :ternary iki durum(T/F) için farklı data type çıktısı veriyorsa veriable atama yapmadan sout yapılmalı
        ya da ternary çıktısı aynı data type serializable edilmeli...
         */

    }
}
