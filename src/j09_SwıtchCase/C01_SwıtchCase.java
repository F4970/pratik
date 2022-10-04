package j09_SwıtchCase;

import java.util.Scanner;

public class C01_SwıtchCase {
    public static void main(String[] args) {

        /*
Switch Case deyimi islev bakimindan if deyimine çok benzemektedir.
Çok sayida if islem bloklari kullandigimizda programin okunurlugu azalacak ve
programi izlemek zorlasacaktir. Programimizin bir degerini bir çok degerle
 karsilastirmak gerektiginde switch komutunu kullanacagiz. Switch seçenegi
 ile degiskenin durumuna göre bir çok durum içersinden bir tanesi gerçeklestirilir.
 Istersek de if deyimi ile switch case'' yi birlikte kullanabiliriz.
  Switch in yaptigi is kisaca, ifadenin degerini sirayla sabitlerle karsilastirarak ve her satiri islemektir.
  çok sayıda koşul içeren durumlarda switch kullanmak if'e göre programınızın daha hızlı çalışmasını sağlıyor.
  Bunun haricinde iki koşul ifadesi arasında dikkate değer bir performans farklılığı bulunmuyor.

 ahan da TRICK-> Switch Statement'de long,double,float ve boolean asla KULLANILMAZZZ.. CISSS


 */

        //TASK Kullanıcın girdiği rakamı yazı ile print eden code create edin

        Scanner scanner=new Scanner(System.in);
        System.out.println("bir rakam girin : ");
        int rakam=scanner.nextInt();

        System.out.println("*** if-else***");

        if (rakam==0) {
            System.out.println("girilen rakam SIFIR");
        }else if (rakam==1) {
        System.out.println("girilen rakam BİR");
        }else if (rakam==2) {
        System.out.println("girilen rakam iKİ");
        }else if (rakam==3) {
            System.out.println("girilen rakam ÜÇ");
        }else if (rakam==4) {
            System.out.println("girilen rakam DÖRT");
        }else if (rakam==5) {
            System.out.println("girilen rakam BEŞ");
        }else if (rakam==6) {
            System.out.println("girilen rakam ALTI");
        }else if (rakam==7) {
            System.out.println("girilen rakam YEDİ");
        }else if (rakam==8) {
            System.out.println("girilen rakam SEKİZ");
        }else if (rakam==9) {
            System.out.println("girilen rakam DOKUZ");
        } else System.out.println("adam gibi rakam gir");


        System.out.println("***swıtch case ***");

        switch (rakam) {
            case 0:
                System.out.println("girilen rakam SIFIR");
               break;
            case 1:
                System.out.println("girilen rakam BİR ");
                break;

            default:
                System.out.println("adam gibi rakam gir ");
        }
        System.out.println("bu yazıyı okuduysan switchden çıkmıssındır");






        }






    }

