package javatask1;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {

        /* Task->
Girilen ad soyad bilgilerinin ilk harflerini buyuk harf print eden code create ediniz..
 */

        Scanner scanner=new Scanner(System.in);
        System.out.println("adınız : ");
        String ad =scanner.nextLine();
        System.out.println("soyadınız : ");
        String soyad=scanner.nextLine();

        System.out.println(ad.substring(0,1).toUpperCase()+ad.substring(1) );
        System.out.println(soyad.substring(0,1).toUpperCase()+soyad.substring(1) );



    }
}
