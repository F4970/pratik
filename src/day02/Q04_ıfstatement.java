package day02;

import java.util.Scanner;

public class Q04_ıfstatement {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        System.out.println("Lutfen Y/N ikilisinden birini giriniz : ");
        char karakter =scanner.next().charAt(0);

        if(karakter=='Y' || karakter== 'y') {
            System.out.println("YES");
        }else if (karakter =='N'|| karakter=='n' ) {
            System.out.println("NO");
        }else {
            System.out.println("yanlış giriş yaptınız.. Lütfen tekrar deneyin");
        }
    }
}
