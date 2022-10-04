package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class c06_NestedTernaryOperator {

    public static void main(String[] args) {

        /*
 TASK :
Kullanicidan bir sayi aliniz
Sayi 0 dan buyuk esit ise 10 dan kucuk olup olmadigini kontrol ediniz.
10 dan kucuk ise ekrana "Rakam" yazdiriniz degilse "Pozitif Sayi" yazdiriniz.
Sayi o dan kucuk ise ekrana "Negatif Sayi" yazdiriniz.
 */
        Scanner scanner = new Scanner(System.in);
        System.out.println("bir sayı girin : ");
        int sayı = scanner.nextInt();

        System.out.println(sayı >= 0 ? (sayı < 10 ? "Rakam" : "pozitif sayı ") : "Negatif Sayı");
        {
        }
    }
}
     /* her soru işaretine bir eşittir gerekiyor yukarıdada iki soru işareti iki eşittir var
    }


      */
