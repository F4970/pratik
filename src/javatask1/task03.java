package javatask1;

public class task03 {
    public static void main(String[] args) {

        //"Alamanya" Stringindeki ikinci 'a' caharacterinin indexini bulunuz.

       String str = "Alamanya";
      // str.indexOf('a'): ilk a nın indexini verir.
        System.out.println(str.indexOf ('a',str.indexOf('a')+1));

    }
}
