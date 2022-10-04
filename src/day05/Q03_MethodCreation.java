package day05;

import java.util.Scanner;

public class Q03_MethodCreation {
    public static void main(String[] args) {
        /*
 cm olarak verilen bir sayiyi, metre ve kilometreye donusturen bir method yaziniz
  */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı girin");
        double santimetre = scanner.nextDouble();
        System.out.println(metreyeçevir(santimetre));
        System.out.println(kmyeçevir(santimetre));
        convertFromSM(santimetre);
    }

    public static double metreyeçevir(double sayı1) {

        return sayı1 / 100;
    }

    public static double kmyeçevir(double sayı2) {
        return sayı2 / 100000;

    }
    public static void convertFromSM(double sayi) {
        System.out.println("girilen santimeter degeri : " + sayi/100 + " metre\n" + sayi/100000 + " kilometredir");

    }
}