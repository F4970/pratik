package day04;

import java.util.Scanner;

public class Q03_StringManipulation {
    public static void main(String[] args) {


        // String seklinde verlen asagidaki fiyatlarin toplamini bulunuz
        // String  str 1= "$13.99"
        // String str 2= "$10.55"
        // ipucu: Double parseDouble() methodunu kullanabilirsiniz.
        //kelimeyi sayıya dönüştür.

  /* Regular Expression(regex) : Belli turdeki characterleri secebilmemize yarar.
1) \\d    ==> tum rakamlar
    \\D    ==> tum rakam disi character ler
2) \\w   ==> A->Z     a->z         0->9    _
    \\W  ==> A->Z    a->z         0->9    _ disindaki hersey
3) \\s   ==> space
    \\S   ==> space disindaki hersey  */


        String  str1= "$13.99";
        str1=str1.replaceAll("\\D","");
        System.out.println(str1);//1399

        String str2= "$10.55";
        str2=str2.replaceAll("\\D","");
        System.out.println(str2);//1055


        System.out.println(str1+str2); //13997055

        // str1 ve str2 içeriği sayı olan string ifadelerdir.
        //Eğer içeriğinin tamamen sayı olduğunu bildiğimiz String varsa parseDouble() veya parseInteger()methodu kulllanabiliriz.

        double sayı1=Double.parseDouble(str1); //String olan str1, sayı olan sayı1e donustu
        double sayı2=Double.parseDouble(str2); //String olan str2, sayı olan sayı2 ye donustu

        double toplam=(sayı1+sayı2)/100; //tekrar virgüllü olsun diye 100 e böldük
        System.out.println("$"+toplam);











    }
}
