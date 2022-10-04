package day03;

import java.util.Scanner;

public class Q07_SwitchCase {
    public static void main(String[] args) {


        //Girilen üç haneli bir sayının okunuşunu yazı ile yazıdırınız .

        Scanner scanner=new Scanner(System.in);
        System.out.println("3 haneli pozitif bir sayı giriniz : ");
        int sayı=scanner.nextInt();

        int yüzler=sayı/100, onlar= (sayı/10)%10, birler= sayı%10;

        if(sayı>99 && sayı<1000) {
            switch (yüzler) {
                case 0 :
                    System.out.println("");
                    break;
                case 1:
                    System.out.print("yüz");
                    break;
                case 2 :
                    System.out.print("ikiyüz");
                    break;
                case 3:
                    System.out.print("üçyüz");
                    break;
                    case 4 :
                    System.out.print("dörtyüz");
                    break;
                case 5:
                    System.out.print("beşyüz");
                    break;
                    case 6 :
                    System.out.print("altıyüz");
                    break;
                case 7:
                    System.out.print("yedi yüz");
                    break;
                case 8:
                    System.out.print("sekizyüz");
                    break;
                case 9 :
                    System.out.print("dokuzüz");
                    break;

            }

            switch (onlar) {

                case 0:
                    System.out.print("");
                    break;
                case 1:
                    System.out.print("on");
                    break;
                case 2:
                    System.out.print("yirmi");
                    break;
                case 3:
                    System.out.print("otuz");
                    break;
                case 4:
                    System.out.print("kırk");
                    break;
                case 5:
                    System.out.print("elli");
                    break;
                case 6:
                    System.out.print("altmış");
                    break;
                case 7:
                    System.out.print("yetmiş");
                    break;
                case 8:
                    System.out.print("seksen");
                    break;
                case 9:
                    System.out.print("doksan");
                    break;

            }
             switch (birler) {
            case 0 :
                System.out.println("");
                break;
            case 1:
                System.out.print("bir");
                break;
            case 2 :
                System.out.print("iki");
                break;
            case 3:
                System.out.print("üç");
                break;
            case 4 :
                System.out.print("dört");
                break;
            case 5:
                System.out.print("beş");
                break;
            case 6 :
                System.out.print("altı");
                break;
            case 7:
                System.out.print("yedi");
                break;
            case 8:
                System.out.print("sekiz");
                break;
            case 9 :
                System.out.print("dokuz");
                break;













            }
        }




    }
}
