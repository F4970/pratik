package javatask1;

import java.util.Scanner;

public class j4 {
    public static void main(String[] args) {

        /*
		TASK :
		Kullanicidan  yasini ve kilosunu alaliniz
		18 yasindan kucuk ise kan bagisi yapamaz
		18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
		18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.
		 */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen yaşınızı giriniz : ");
        int yas=scanner.nextInt();
        System.out.println("Lutfen kilonuzu giriniz : ");
        int kilo=scanner.nextInt();

        if ( yas<18 ) {
            System.out.println("Maalesef kan bagısı yapamazsınız ");
        }else if (yas>=18 && kilo<50) {
            System.out.println("Uzgunuz kilodan dolayı kan bagısı yapamazsınız ");
        }else if (yas>=18 && kilo>50) {
            System.out.println("Kan bagısı yapabilirsiniz ");
        }
    }
}
