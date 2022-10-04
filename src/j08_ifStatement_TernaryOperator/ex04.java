package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {

      // Scanner scanner =new Scanner(System.in);

      // System.out.print("bir sayı giriniz : ");

      // int sayi =scanner.nextInt();

      //  girilen bir karakterin harf olup olmadıgıno kontrol eden code vreate edin

        Scanner scanner=new Scanner(System.in);
        System.out.println("bir karakter giriniz : ");
        char ch =scanner.next().charAt(0);
        if((ch>= 'A'&& ch <='Z') || (ch>='a'&& ch<='z')) {
            System.out.println("girdiğiniz karakter hafrtir");
        }else{
            System.out.println("girdiğiniz krakter harf değildir ") ;
        }
    }
}
