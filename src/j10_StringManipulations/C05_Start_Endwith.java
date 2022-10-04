package j10_StringManipulations;

public class C05_Start_Endwith {

    public static void main(String[] args) {

        String sehir="İstanbul";
        System.out.println(sehir.startsWith("i")); //true
        System.out.println(sehir.startsWith("is")); //true
        System.out.println(sehir.startsWith("s")); // false
        System.out.println(sehir.startsWith( "t" , 2)); //true 3.indexten başlar

        System.out.println(sehir.endsWith("l")); //true
        System.out.println(sehir.endsWith("bul")); //true
        System.out.println(sehir.endsWith("bu")); //false

        String str="bul";
        System.out.println(sehir.endsWith(str));//true



    }
















}
