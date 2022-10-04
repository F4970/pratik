package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {

        /*
        Task01
girilen bir sayının negatif ve pozitifliğini kontrol eden code create ediniz..
         */
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("bir sayı girin : ");

        // int sayı = scanner.nextInt();
        // if (sayı> 0) {
        //     System.out.println("sayı pozitif");

        // } else if ( sayı <0) {
        //     System.out.println("sayı negatif ");

        // }else {
        //     System.out.println("girilen sayı sıfır");


            /*
 Kullanicidan 100 uzerinden notunu isteyin.
 Not'u harf sistemine cevirip yazdirin.
 50’den kucukse "D",
 =50  <60 arasi "C",
 =60  <80 arasi "B",
 =80’nin uzerinde ise "A"
 */

        Scanner scanner = new Scanner(System.in);
        System.out.println("notunuzu giriniz : ");
        int sayı = scanner.nextInt();

        if (sayı <0 || sayı >100){
             } else if (sayı < 50) {
                System.out.println("D");
            } else if (sayı>=50&&sayı<60) {
                System.out.println("C");
            } else if (sayı>=60&&sayı<80) {
                System.out.println("B");

            } else if (sayı>=80&&sayı<=100) {
                System.out.println("A");

            } else {
            System.out.println("100 den büyük not olmaz");


            }
        }
    }

