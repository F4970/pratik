package j10_StringManipulations;

import java.util.Scanner;

public class Stringtask12 {
    public static void main(String[] args) {


        /*  TASK :
        Kullanıcıdan alacağınız, 3 kelimelik  ismi
         Örn. Ali Mert Yılmaz -> A.M.Y.  şeklinde print eden code create ediniz.
        */

        Scanner scanner=new Scanner(System.in);
        System.out.println("isminizi giriniz : ");

        String ad1=scanner.next().toUpperCase();
        String ad2=scanner.next().toUpperCase();
        String ad3=scanner.next().toUpperCase();

        System.out.println(ad1.substring(0,1) + "."+ad2.substring(0,1)+"."+ad3.substring(0,1)+".");


    }
}
