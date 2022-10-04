package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class ifst6 {
    public static void main(String[] args) {

        /*  int number 8. satırda.
     Eğer, int number ikiye bölündüğünde geri kalanı 0'a eşit ise "number is a EVEN number" yazdırın.
     Eğer, int number ikiye bölündüğünde geri kalanı 0'a eşit değil ise "number is a ODD number" yazdırın.
*/
      // Scanner scan = new Scanner(System.in);
      // System.out.println("bir rakam girin ");
      // int number = scan.nextInt();

      // //Kodu aşağıya yazınız. BU SATIRIN YUKARISINI DEĞİŞTİRMEYİNİZ.

      // if (number%2==0) {
      //     System.out.println("number is a EVEN number");
      // } else {
      //     System.out.println("number is a 0DD number ");

        Scanner scanner=new Scanner(System.in);
        System.out.println("bir rakam girin : ");
        int number=scanner.nextInt();

        System.out.println((number/2==0) ? "number is a EVEN number " : "number is a ODD number" );
        }
    }

