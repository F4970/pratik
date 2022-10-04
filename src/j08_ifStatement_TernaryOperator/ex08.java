package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class ex08<sou> {
    public static void main(String[] args) {

        /*Kullanicidan bir sayi alin

        Eger sayi pozitif ise; 10dan buyuk olup olmadigini kontrol edin
        Eger 10 dan buyuk ise "Buyuksun!" yazdirin
        Eger 10 dan kucuk ise "Normalsin!" yazdirin

        Eger sayi pozitif degil ise; -10dan buyuk olup olmadigini kontrol edin
        Eger -10 dan buyuk ise "Negatifsin!" yazdirin
        Eger -10 dan kucuk ise "Cok Negatifsin!" yazdirin

         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("bir sayı girin");
        int sayi = scanner.nextInt();

        if (sayi>0) {
        if (sayi>10) {
            System.out.println("Buyuksun!");}
        }else if(sayi<10) {
            System.out.println("Normalsin!");}

        if (sayi<0) {
        if(sayi>-10) {
            System.out.println("Negatifsin !");}
        }else if (sayi<-10) {
            System.out.println("Çok Negatifsin"); }



            }
        }
