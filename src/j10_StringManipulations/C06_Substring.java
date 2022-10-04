package j10_StringManipulations;

import java.util.Scanner;

public class C06_Substring {
    public static void main(String[] args) {

        /*
substring()
Metin icinde, istenilen araliktaki bir parcasina ya da butunune ulasilabilir. Sonuc ise String dir.
substring(i)->Method'a parametre olarak girilen  index'den sona kadar olan parcayi return eder
substring(baslangicIndexi, bitisIndexi)->Method'a parametre olarak girilen  baslangicIndexi'den bitis
indexi'e kadar parçayı return eder
baslangic indexi ==> inclusive/dahil
bitis indexi ==> eclusive/haric
 */

        String str = "java bilen sırtı yere gelmez :) ";
        System.out.println(str.substring(10));// sırtı yere gelmez :)
        //str datasının son 10 karakerini yazdırınız.
        System.out.println(str.substring(str.length() - 10)); //gelmez :)
        //str datasının ilk 10 karakterini yazdırınız.
        System.out.println(str.substring(0, 10));// java bilen : 0,1,2,3...9 karakter alır
        //str datasının ilk karakterini print ediniz.
        System.out.println(str.substring(0, 1)); //0 alır 1 almaaz yani 0.karakter ilk karakteri verir


        //task  girilen 4 harfli kelimeyi tersten yazdırınız

        Scanner scanner=new Scanner(System.in);
        System.out.println("4 harfli bir kelime yazın :");
        String kelime=scanner.nextLine().toLowerCase();

         if (kelime.length()!=4) {
             System.out.println("4 harf girin lütfen");

         }else {
             System.out.println(kelime.substring(kelime.length() - 1) + kelime.substring(2,3) + kelime.substring(1,2) + kelime.substring(0,1));
         }

    }
}
