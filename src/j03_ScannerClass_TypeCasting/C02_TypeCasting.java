package j03_ScannerClass_TypeCasting;

import java.util.Scanner;

public class C02_TypeCasting {
    public static void main(String[] args) {

          /*
 byte < short < int < long < float < double
   Auto Widening Casting -> Kucuk data type'larini buyuk data typlearina
Java  otomatik olarak yapar.

 */
        boolean başarılı =true;
        boolean başarı= başarılı;
        //System.out.println("basarılı="+başarılı); true
        //System.out.println("basarı="+başarı); true

        double d=17; // double veriable'a int 17 atandı k>b
        System.out.println("d="+d);// d =17.0 auto widding
        int sayi1=33;
        int sayi2=7;

        System.out.println(sayi1/sayi2);//4
        /*
        java iki int sayiyi biribirine böldüğünüzde sonucu int verir
        eğer bölme işleminde ondalık sonuç çıkarsa ondalık kısmı siler
         */

        byte b=127;
        int i=b;// k.>b kücügü büyüğe atamak
        System.out.println("i="+i);//127

        int num=1453;
        double d1=num;// k.>b aw
        System.out.println( "d1="+ d1);//1453.0


        double db=d1/num;// TRICK ; iki farkli data type sayi işleme girerse java
                                      //küçük olan data type türü için aw yapar sonucu büyük olan data type olarak verir

        System.out.println("db="+db);// 0.01169993117687543
                /*
            byte < short < int < long < float < double
		 Explicit Narrowing Casting ->Buyuk data type'larini kucuk data type'larina cevirme islemini veri kaybndan dolayı
		 Java otomatik olarak yapmaz. kod ile teyit ister...

                 */

        double d2=14.53;
        int num2= (int) d2 ;// b >k
        System.out.println("num 2= "+ num2);//14
        int num3=150;
        byte b1=(byte) num3;
        System.out.println("b1=" +b1);// b1 =-106

        double d3 =333;
        long l= (long) d3;

        double d4=571.4444;
        long l2= (long)  d4;
        System.out.println("l2 = " + l2);// 571


        /*task :
        /* task->
         * Kullanicidan bir character girmesini isteyin ve
         * girilen karakteri ve ascii degerini yazin
         *
         * Ornek : Input  : a
         *         Output : Girdiginiz ‘a’ karakterinin ascii degeri : 95
         *
         */

        Scanner sc = new Scanner((System.in)); //1.adım
        System.out.println("ascii değeri istediğin karakteri gir :");//2. adım
        char ch= sc.nextLine().charAt(0);

        int chasciiDeğeri=ch;
        System.out.println("chasciiDeğeri = " + chasciiDeğeri);//$ ın chasciiDegeri =36













    }
}
