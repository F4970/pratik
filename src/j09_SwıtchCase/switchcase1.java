package j09_SwıtchCase;

import java.util.Scanner;

public class switchcase1 {
    public static void main(String[] args) {

        // Girilen bir sayının onlar basamağının değerini yazı ile yazdırınız.

        Scanner sc = new Scanner(System.in);
        System.out.println("bir sayı girin : ");
        System.out.print("Sayi = ");
        int sayi = sc.nextInt();
        sayi /= 10;
        int onlar=sayi%10;

        switch (onlar){
            case 1:
                System.out.println("Bir");
                break;
            case 2:
                System.out.println("İki");
                break;
            case 3:
                System.out.println("uc");
                break;
            case 4:
                System.out.println("dort");
                break;
            case 5:
                System.out.println("bes");
                break;
            case 6:
                System.out.println("altı");
                break;
            case 7:
                System.out.println("yedı");
                break;
            case 8:
                System.out.println("sekız");
                break;
            case 9:
                System.out.println("dokuz");
                break;

            default:
                System.out.println("lutfen bir sayı girin");
        }
    }
}
