package javatask1;

import java.util.Scanner;

public class j3 {
    public static void main(String[] args) {

        /* TASK :
    Kullanicidan 3 Numara isteyiniz ve bu numaralarin en buyuk ve
    en kucuk olanlarini konsola yazdiriniz
    int num1
    int num2
    int num3
*/
        Scanner scanner=new Scanner(System.in);
        System.out.println("a rakamı giriniz :");
        int a= scanner.nextInt();
        System.out.println("b rakamı giriniz : ");
        int b=scanner.nextInt();
        System.out.println("c rakamı giriniz : ");
        int c=scanner.nextInt();

        if (a>b && a>c) {
            System.out.println("a en buyuktur");
         }else if (b>a && b>c) {
            System.out.println("b en buyuktur");
        }else if (c>a && c>b) {
            System.out.println("c en buyuktur ");
        if (a<b && a<c) {
            System.out.println("a en kucuktur");
        }else if (b<a && b<c ) {
            System.out.println("b en kucuktur");
        }else if (c<a && c<b) {
            System.out.println("c en kucuktur");

            }
        }
    }
}
