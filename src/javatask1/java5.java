package javatask1;

import java.util.Scanner;

public class java5 {
    public static void main(String[] args) {

        /*
         * TASK :

         * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
         * musteri karti olup olmadigini sorun
         * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin
         * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az
         * alirsa %10 indirim yapan code create ediniz.
         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Aldığınız ürün adedini giriniz : ");
        int adet=scanner.nextInt();
        System.out.println("ürünün fiyatı : ");
        int fiyat=scanner.nextInt();

        System.out.println("Müşteri kartınız var mı varsa E'ye YOKSA H'ye basınız :");
        char kart=scanner.next().toUpperCase().charAt(0);

        if (kart=='E' && adet>10) {
            System.out.println("tebrikler %20 indirim kazandınız :) "+ "Yeni fiyat : "+(fiyat-(fiyat*20/100)));
        }else if (kart=='E' && adet<10) {
            System.out.println("tebrikler %15 indirim kazandınız :) "+"Yeni fiyat : "+(fiyat-(fiyat*15/100)));
        }else if (kart=='H' && adet>10) {
             System.out.println("tebrikler %15 indirim kazandınız :) "+"Yeni fiyat : "+(fiyat-(fiyat*15/100)));
         }else if(kart=='H' && adet<10) {
             System.out.println("tebrikler %10 indirim kazandınız :) "+"Yeni fiyat :" +(fiyat-(fiyat*10/100)));
         }


             }
         {

            }
        }






