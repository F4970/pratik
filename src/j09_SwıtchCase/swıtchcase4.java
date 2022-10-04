package j09_SwıtchCase;

import java.util.Scanner;

public class swıtchcase4 {
    public static void main(String[] args) {

        /*
		Girilen  ayın  kac cektigini print eden code create ediniz.
		 */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Bir ay numarası giriniz : Ocak\n 1 Subat\n2 Mart\n3 Nısan \n4 Mayıs\n5 Haziran\n6 Temmuz\n7 Agustos\n8 Eylul\n9 ekım\n10 kasım \n11 Aralık\n ");
        int gun =scanner.nextInt();
        switch (gun) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 9:
            case 11:
                System.out.println("31 çekiyor");
                break;
            case 4:
            case 6:
            case 8:
            case 10:
                System.out.println("30 cekiyor");
                break;
            case 2:
                if (gun%4==0) {
                    System.out.println("girilen şubat ayı 29 gun içerir. ");
                }else {
                    System.out.println("girilen ay 28 gun içerir. ");
                }


        }
















    }
}
