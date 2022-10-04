package day05;

import java.util.Scanner;

public class Q04_MethodCreation {
    public static void main(String[] args) {
        /*
Kullanicidan bir tam sayi alin.
Bu sayinin negatif veya pozitif oldugunu,
tek mi cift mi oldugunu ve
uc basamakli veya daha buyukse birler,onlar ve yuzler basamagindaki rakamlarin toplamini,
100'den kucukse sadece birler basamagini yazdirin.
*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("bir tamsayı giriniz : ");
        int sayı = scanner.nextInt();
        pozitifnegatif(sayı);
        System.out.println(Q02_MethodCreation.isEven(sayı));

        System.out.println("sayı çift = " + Q02_MethodCreation.isEven(sayı));

        System.out.println(sayı >= 100 ? (yuzdenbuyuk(sayı)) : (yuzdenkucuk(sayı)));

    }
    public static int yuzdenkucuk(int sayı) {
        return sayı%10;
    }
    public static int yuzdenbuyuk(int sayı) {
        int birler = sayı %10 , onlar= (sayı/10)%10 , yüzler= sayı/100;
        int toplam =0;
        toplam= birler+onlar+yüzler;
        return toplam;
    }
    public static void pozitifnegatif(int sayı) {

        System.out.println(sayı>0 && sayı!=0);
        }

        }
