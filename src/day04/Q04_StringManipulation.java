package day04;

import java.util.Scanner;

public class Q04_StringManipulation {
    public static void main(String[] args) {

        /*
         * Kulanicidan bir kelime isteyin eger kelime 3 ve daha fazla harfden olusuyorsa son
         * iki harfini 3 kere yan yana yazdirin. degil ise girilen kelimeyi yazdirin
         *
         * ornek
         * input = Ali
         * output = lilili
         *
         * input = el
         * output = el
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir kelime yazınız : ");
        String kelime = scanner.next();

        if (kelime.length()>= 3) {
            System.out.println((kelime.substring(kelime.length()-2)+(kelime.substring(kelime.length()-2)+(kelime.substring(kelime.length()-2)))));
        } else {
            System.out.println(kelime);









        }
    }
}
