package j11_MethodCreation;

import java.util.Locale;
import java.util.Scanner;

public class methodtask6 {
    public static void main(String[] args) {
/*
		 Kullanıcıya paralelkenar, dikdörtgen ve üçgen kelimelerinden birini
		 ve iki sayı seçmesini söyleyin.
         Hangi şekli seçerse, o şeklin alanını ve çevresini ekrana yazdıran programı yazınız.
		 */

        Scanner scanner=new Scanner(System.in);
        System.out.println("paralelkenar, dikdörtgen ve üçgenden birini seçiniz: ");
        char paralel  =scanner.next().charAt(0);
        String dikdörtgen=scanner.next().toLowerCase();
        String üçgen=scanner.next().toLowerCase();
        System.out.println("Bir rakam giriniz : ");
        double sayı1 =scanner.nextDouble();
        System.out.println("Bir rakam daha giriniz :");
        double sayı2=scanner.nextDouble();

        double paralelkenarçevresi=kenarhesapla(sayı1,sayı2);
        System.out.println("paralelkenarçevresi = " + paralelkenarçevresi);


    }
    public static double kenarhesapla(double a , double b) {

            return ((a*a)+(b*b));
    }


}
