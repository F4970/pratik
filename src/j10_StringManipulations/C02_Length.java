package j10_StringManipulations;

public class C02_Length {
    public static void main(String[] args) {

        /*

        length() methodu girilen stringin uzunluğunu:içinde bulunan karakter sayısını return eder.
        butun karakterleri(boşluk vs ) sayıp adedini verir
         */

        String str ="madem geldin dünyaya otur çalış Javaya";
        str.length(); //int type bir data verir
        int strKaraktrsayısı= str.length(); // int type bir data verir.
        System.out.println(strKaraktrsayısı); //38
        System.out.println(str.length());

        String str1=""; // hiçlik 0 değerini verir
        System.out.println(str1.length());

        String str2=" "; // 1 deüerini verir boşluk da bir karakterdir
        System.out.println(str2.length());

        String str3=null; // hiç olma hali yoktur
        System.out.println(str3.length()); //cte verir.. run time error

        /*
        null case sensitive bir değerdir. yanı Null veyaNULL yazılamaz
        null bir değer değildir (dutluk) sadece hiçliği gösteren bir pointer(giriş noktasıdır)
         */
















    }
}
