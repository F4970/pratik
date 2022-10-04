package j10_StringManipulations;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        // task : girilen bir cümlede aranan kelimenin varlığını kontrol eden bir code create ediniz. ternary kullanınız


        Scanner scanner=new Scanner(System.in);
        System.out.println("Bir cümle giriniz : ");
        String cümle =scanner.nextLine();
        System.out.println("Aradığınız kelime : ");
        String kelime= scanner.nextLine();
        String sonuc=(cümle.contains(kelime) ? "true" : "false");
        System.out.println("sonuc = " + sonuc);













    }
}
