package j09_SwıtchCase;

import java.util.Scanner;

public class C05_SwitchCase_ATM_Project {
    public static void main(String[] args) {

        // Bakıye (başlangıç bakıyesi 1000 tl ) ögrenme , para yatırma  ve cekme , çıkış işlemlerinin yapıldığı
        //bir app code create ediniz

        Scanner scanner=new Scanner(System.in);
        System.out.println(" *** ");
        System.out.println("*** ATM 'ye Hoşgeldiniz*** ");

        System.out.println("Bakıye ögrenme : 1\nPara yatırma 2\nPara Çekme 3\nCIKIS 4\nGiriniz");
        int secım=scanner.nextInt();
        int bakıye=1000;

        switch (secım) {
            case 1:
                System.out.println("bakıye = " + bakıye);
                break;
            case 2:
                System.out.println("Ne kadar yatıracaksın ?");
             int yatırılanmiktar=scanner.nextInt();
             bakıye+=yatırılanmiktar;
                System.out.println("bakıyenin guncel hali= " + yatırılanmiktar);
                break;
            case 3:
                System.out.println("ne kadar çekeceksiniz?");
                int cekilenmiktar=scanner.nextInt();
                if (cekilenmiktar> bakıye) {
                    System.out.println("olmayan parayı çekemezsiniz");
                    System.out.println("bakıyeniz : "+ bakıye);
                }else {
                    bakıye = cekilenmiktar;
                    System.out.println("bakıyenin guncel halı :" + bakıye);
                    break;
                }
                    case 4:
                        System.out.println("çıkışınız yapıldı");
                        break;

                    default:
                        System.out.println("hatalı seçim");

                }
        }

















    }

