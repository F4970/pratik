package j04_AritmeticOperators;

import java.util.Scanner;

public class C03_RakamToplamı {
    public static void main(String[] args) {

     //  // kullanıcıdan alınan 3 basamaklı bir sayının rakamları toplamını print eden code create edin

       Scanner scanner=new Scanner(System.in);
       System.out.println("3 basamaklı bir sayı girin : ");

       int sayi=scanner.nextInt();

       //1 ' ler basamağı : bir sayının 10 ile bölümünden kalandır

        int birler =sayi%10;
        sayi /= 10; //sayı 10 ile bölümünden bölümü verir 853/10 : 85
        int onlar = sayi %10; // 85 'in ' 10 a bolumunden kalan
        int yüzler = sayi/10; //85 in 102a bölumu




}
    }