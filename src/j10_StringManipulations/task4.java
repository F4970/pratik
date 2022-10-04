package j10_StringManipulations;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {

        /* TASK :
         * Kullanicidan bir isim isteyiniz ve isim sadece 3 harfli olmalidir ternary
         * kullanarak harflerin unique(farkli) olup olmadigina bakiniz e.g: ala => 3
         * Test data: ali eme all
         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("3 harfli bir isim girin ");
        String cümle =scanner.nextLine();

        System.out.println((cümle.length()>3) ? "isim 3 harf olmalı" : (cümle.charAt(0)==cümle.charAt(1) || cümle.charAt(0)==cümle.charAt(2) || cümle.charAt(1)==cümle.charAt(2) ? "girdiğin veride aynı harfler var" : "harfler birbirinden farklı" ));



















    }
}
