package day04;

import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Scanner;

public class Q11_StringManipulation {
    public static void main(String[] args) {

// Kullanicidan isim ve soyismini girmesini isteyin ve hangisinin daha uzun oldugunu yazdirin.

        Scanner scanner=new Scanner(System.in);
        System.out.println("isminiz : ");
        String isim= scanner.next().toLowerCase();
        System.out.println("soyisminiz : ");
        String soyisim= scanner.next().toLowerCase();

        if (isim.length()>soyisim.length()) {
            System.out.println(isim);
        }else if (soyisim.length()>isim.length()){
            System.out.println(soyisim);
        }else
        System.out.println("eşit");













    }
}
