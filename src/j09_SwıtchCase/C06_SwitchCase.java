package j09_SwıtchCase;

import java.util.Scanner;

public class C06_SwitchCase {
    public static void main(String[] args) {

        // Girilen haftanın gününü hafta içi veya sonu olan code create edin



        Scanner scanner=new Scanner(System.in);

        System.out.println(" hafta gün ismini giriniz : ");
        String Gun=scanner.next().toLowerCase(); //PazaAR girilse bile girilen karakterler tolowerCase ile kucuk harfe donusur

        switch (Gun) {
            case "pazartesi":
            case "salı":
            case "carsamba":
            case "persembe":
            case "cuma":
         //yukarıdaki tüm caseler aynı alacağı için break atanmadı
                System.out.println(" hafta içine ait");
                break;
            case "cumartesi":
            case "pazar":
                System.out.println("hafta sonu");
                break;

            default: // swıcth hiç bir case eşleşmezse çalışır
                System.out.println("lutfen doğru giriş yapın");
        }





















    }
}
