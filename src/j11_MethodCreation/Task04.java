package j11_MethodCreation;

import java.util.Scanner;

public class Task04 {
        /*
    Bakıye (başlangıç bakıyesi 1000 tl) öğrenme, para yatırma ve cekme, çıkış işlemlerinin yapıldıgı bir
     ATM app. code create ediniz
     */

    static Scanner scanner = new Scanner(System.in);
    static int bakıye = 1000;


    public static void main(String[] args) {
        System.out.println(" *** ");
        System.out.println("*** ATM 'ye Hoşgeldiniz*** ");
        System.out.println(" *** ");
        System.out.println("Bakıye ögrenme : 1\nPara yatırma 2\nPara Çekme 3\nCIKIS 4\nGiriniz");

        seçim();// method call
    }//main dışı

    public static void seçim() {
        System.out.println("agam yapacağın işlemi seç :");
        int seçim = scanner.nextInt();
        switch (seçim) {
            case 1:
                bakıyever();
                break;
            case 2:
                parayatır();
                break;
            case 3:
                paraçek();
                break;
            case 4:
                çıkışyap();
                break;

            default:
                System.out.println("agam daha seçim yapamirsen bide para istirsen ..");
        }


    }

    private static void çıkışyap() {
        System.out.println("agam yine bekleriz çıkışınız yapılmıştır selametle güzel insan :) ");

    }

    private static void paraçek() {
        System.out.println("agam ne kadar çekecen :");
        int çekilecekmiktar=scanner.nextInt();
        if (çekilecekmiktar<=bakıye) {
            bakıye -= çekilecekmiktar;
            System.out.println("agam para cebinde gözünng aydın :) ");
            System.out.println("agam bakiye = " + bakıye);

        }else System.out.println("agam nettin olmayan parayı mı istiyon ");
        }


    private static void parayatır() {

        System.out.println("agam elin tutulmaz ne gada yaticeeng : ");
        int yatırılacakMiktar=scanner.nextInt();

        bakıye+=yatırılacakMiktar;
        System.out.println("agam yeni bakiyen :" + bakıye);
        karar();


    }

    private static void bakıyever() {
        System.out.println("agam bakiye : " + bakıye);
        karar();

    }

    public static void karar() {
        System.out.println("agam işleme devamkee ise : 1 \n yeter : 0 ");
        int karar = scanner.nextInt();
        if (karar == 1) {
            seçim();
        } else if (karar==0 ) seçim();
        else System.out.println("agam adam gibi karar gir");
    }
}