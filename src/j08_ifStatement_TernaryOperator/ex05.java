package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {

      /*  TASK -> girilen iki sayiyi seçilen dört işlemden birine uygulayıp sonucu print eden code crate ediniz


       */
        Scanner scanner=new Scanner(System.in);
        System.out.println("1.sayıyı girin : ");
        double sayi1=scanner.nextDouble();
        System.out.println("2.sayıyı giriniz :");
        double sayi2=scanner.nextDouble();

        System.out.println("+ için : 1 seçiniz \n - için 2 seçin \n * için 3 seçin \n / için 4 ü seçiniz ");
        int secim=scanner.nextInt();
        if (secim == 1) {
            System.out.println("toplama sonucu : " + sayi1 + "+" + sayi2 + "=" + (sayi1 + sayi2));
        } else if (secim == 2) {
            System.out.println("cıkarma sonucu : " + sayi1 + "-" + sayi2 + "=" + (sayi1 - sayi2));
        } else if (secim == 3) {
            System.out.println("carpma sonucu : " + sayi1 + "*" + sayi2 + "=" + (sayi1 * sayi2));
        } else if (secim == 4) {
            System.out.println("bolme sonucu : " + sayi1 + "/" + sayi2 + "=" + (sayi1 / sayi2));

        } else System.out.println("agam ne istiyon adam akıllı bişey gir işlemini yapalım");

        }
        
       
            
        }


