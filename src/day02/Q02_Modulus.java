package day02;

import java.util.Scanner;

public class Q02_Modulus {
    public static void main(String[] args) {

        /*
         *  Kullanicidan alacaginiz 5 basamakli sayinin ilk 2 ve son iki basamagindaki rakamlari toplamini bulunuz
         *
         *   Ex :
         *   input  : 12345
         *   output : 12
         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("5 basamaklı sayı girin : ");
        int sayı=scanner.nextInt();

        int ilkiki=sayı/1000;
        int soniki=sayı%100;

        int ilkikitop = ( ilkiki/10) +(ilkiki % 10);
        System.out.println("ilkikitop = " + ilkikitop);
        int sonikitop = ( soniki / 10) + (soniki % 10);
        System.out.println("sonikitop = " + sonikitop);



    }
}
