package j09_SwıtchCase;

import java.util.Scanner;

public class seyahatprojesicevap {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("***** seyahat şirketimize hos geldiniz *****");
        System.out.println("Frankfurt : 60 km \nKoln : 80\n 20 Km basına 5 euro ucretlendirme yapılır :) ");
        System.out.print("yolculuk yapacagınız sehri seciniz : ");
        String şehir = scanner.next().toUpperCase();
        System.out.println(şehir);

        if (şehir.contains("FRANKFURT")) {
            System.out.println("Rota = Frankfurt\n" + "Frankfurt " + ((60 / 20) * 5) +" Euro");
        }else if (şehir.contains("KÖLN")) {
            System.out.println("Rota = Köln\n" + "Köln " +  ((80 / 20) * 5) +   " Euro ");
        }else{
            System.out.println("frankfurt veya Köln girin lütfen");







            }
        }






















    }

