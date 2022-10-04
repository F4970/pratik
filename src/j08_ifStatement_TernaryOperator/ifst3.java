package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class ifst3 {
    public static void main(String[] args) {

        /* double1 ve double2 isimli iki tane double oluşturulmuştur.
        Eğer double1, double2'dan büyük ise "double 1 is greater than double 2" yazdırınız.
        Eğer double1, double2'dan küçük ise "double 1 is smaller than double 2" yazdırınız. */

     //  double bir = 15.5;
     //  double iki= 85.8;

     //  if (bir>iki) {
     //      System.out.println("double 1 is greater than double 2 ");

     //  } else if (bir<iki ) {
     //      System.out.println("double 1 is smaller than double 2 ");
     //  }

        double double1 = 15.5;
        double double2= 85.8;

        System.out.println(double1>double2 ? "double 1 is greater than double 2" : "double 1 is smaller than double 2" );
    }
}
