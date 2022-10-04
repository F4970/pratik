package day05;

import java.util.Scanner;

public class Q05_MethodCreation {
    public static void main(String[] args) {


//Kullaniciya kac sayi toplamak istedigini sorun.
//Kullanici 2,3 veya 4 degerini girerse, kullanicidan bu sayilari girmesini isteyin ve sayilarin toplamini yazdiriniz.
//Kullanici toplamak istedigi sayi adedini 4'den buyuk girerse "cok sayi girdiniz, ben toplayamam" yazdiriniz.
//2'den kucuk bir sayiyi girerse "En az 2 sayi girmelisiniz" yazdiriniz

        Scanner scanner = new Scanner(System.in);
        System.out.println("kac sayi toplama istiyorsunuz : ");
        int adet = scanner.nextInt();
        if (adet < 2) {
            System.out.println("En az 2 sayi girmelisiniz");
        } else if (adet == 2) {
            ikiSayiTopla();
        } else if (adet == 3) {
            System.out.println(ucSayiTopla());
        } else if (adet == 4) {
            dortSayiTopla();
        } else System.out.println("cok sayi girdiniz, ben toplayamam");

    }

    public static int dortSayiTopla() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("dort sayi giriniz :");
        double sayi1 = scanner.nextDouble();
        double sayi2 = scanner.nextDouble();
        double sayi3 = scanner.nextDouble();
        double sayi4 = scanner.nextDouble();
        System.out.println("dort sayinin toplami :" + (sayi1 + sayi2 + sayi3 + sayi4));

        return 0;
    }
        private static double ucSayiTopla () {
            Scanner scanner = new Scanner(System.in);
            System.out.println("uc sayi giriniz :");
            double sayi1 = scanner.nextDouble();
            double sayi2 = scanner.nextDouble();
            double sayi3 = scanner.nextDouble();
            return sayi1 + sayi2 + sayi3;
        }
        private static double ikiSayiTopla () {
            Scanner scanner = new Scanner(System.in);
            System.out.println("iki sayi giriniz :");
            double sayi1 = scanner.nextDouble();
            double sayi2 = scanner.nextDouble();
            System.out.println("iki sayinin toplami :" + (sayi1 + sayi2));

            return sayi1;
        }
    }
