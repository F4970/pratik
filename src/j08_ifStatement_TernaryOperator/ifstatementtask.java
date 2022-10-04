package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class ifstatementtask {
    public static void main(String[] args) {

        /*  İki tane int oluşturun. Birinci (1.) int 35. İkinci (2.) int 23.
        Eğer (if) Birinci int, İkinci int'den büyükse "int 1 is greater than 2" yazdırın.
        Eğer (if) Birinci int, İkinci int'den küçükse "int 1 is smaller than 2" yazdırın.  */

        //Kodu aşağıya yazınız.

        int bir=35;
        int iki=23;

        if (bir>iki) {
            System.out.println("int 1 is greater than 2");

        }else if (bir<iki) {
            System.out.println("int 1 is smaller than 2");
        } else {
        }
    }
}
