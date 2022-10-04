package j09_SwıtchCase;

import java.util.Scanner;

public class C03_SwıtchClass {
    public static void main(String[] args) {

        // Girilen ay numarasına göre kaç gün çektiğini print eden code create ediniz


        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen ay numarası girin : ");
        int no =scanner.nextInt();

        switch (no) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Girilen ay 31 gun cekiyor");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Girilen ay 30 gun cekiyor");
                break;
            case 2:
                System.out.println("yılınızı giriniz ");
                int yıl=scanner.nextInt();
                if (yıl%4==0) {
                    System.out.println("girilen şubat ayı 29 gun içerir. ");
                }else {
                    System.out.println("girilen ay 28 gun içerir. ");
                }



        }






















    }
}
