package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class ifst5 {
    public static void main(String[] args) {

         /*      8. satırda int number oluşturulmuştur.
                Eğer int number 0 yazdırılırsa "Im neutral",
                Eğer int number 0'dan büyükse "I m positive",
                Eğer int number 0'dan küçükse "I am negative" yazdırılsın.   */

    //   Scanner scan = new Scanner(System.in);
    //   System.out.println("bir rakam giriniz :");

    //   int number = scan.nextInt();

    //   //Kodu aşağıya yazınız. BU SATIRIN YUKARISINI DEĞİŞTİRMEYİNİZ.


    //   if (number==0) {
    //       System.out.println("Im neutral ");
    //   } else if (number>0) {
    //       System.out.println("I m positive ");
    //   }else {
    //       System.out.println(" I am negative ");

        Scanner scanner=new Scanner(System.in);
        System.out.println("bir rakam giriniz :");
        int number =scanner.nextInt();

        System.out.println(number==0 ? "Im neutral " : number>0 ? "Im posıtıve ": "I am negatıve" );
        }
    }

