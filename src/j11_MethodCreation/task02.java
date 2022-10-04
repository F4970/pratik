package j11_MethodCreation;

import java.util.Scanner;

public class task02 {
    public static void main(String[] args) {
        //GİRİLEN AD VE SOYADIN BAŞ HARFLERİNİ BUYUK YAPAN CODE CREATE EDİNİZ

        Scanner scanner=new Scanner(System.in);
        System.out.println("ad  : ");
        String ad=scanner.next();
        System.out.println("soyad : ");
        String soyad =scanner.next();

        İsimSoyisimHarfKontrol(ad,soyad);
    }

    public static void İsimSoyisimHarfKontrol (String ad, String soyad) {

        ad=ad.substring(0,1).toUpperCase()+ad.substring(1).toLowerCase();
        soyad=soyad.substring(0,1).toUpperCase()+soyad.substring(1).toLowerCase();
        System.out.println("ad soyad = " + ad + " " + soyad );
    }
}
