package day04;

import java.util.Scanner;

public class Q05_StringManipulation {
    public static void main(String[] args) {

        /*
         * Kullanicidan 4 kelime isteyin ve cumle olarak yazdirip sonuna . koyun
         *
         * Ornek : Inputs : cesaret, insana, sinirlarini, ogretir
         *         Output : Cesaret insana sinirlarini ogretir.
         *
         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("1. kelimeyi girin");
        String str1=scanner.next();
        System.out.println("2. kelimeyi girin");
        String str2=scanner.next();
        System.out.println("3. kelimeyi girin");
        String str3=scanner.next();
        System.out.println("4. kelimeyi girin");
        String str4=scanner.next();

        System.out.println(str1.substring(0,1).toUpperCase()+str1.substring(1)+" "+str2+" "+str3+" "+str4+"" + ".");



















    }
}
