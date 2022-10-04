package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class ex_06 {
    public static void main(String[] args) {

        /* Kullanıcının cinsiyeti KADIN ise 60 yaşından buyuk ve prim gunu 6000 den fazla ise emekliliğini
           kullanıcının cinsiyeti ERKEK ise 65 yaşından buyuk ve prim gunu 7000 den fazla ise emekliliğini
           kontol edip kalan yıl ve prim gununu print eden code create edin


    }
}

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("cinsiyetiniz Kadın'sa K \n Erkek'se E  giriniz : ");
        char cinsiyet = scanner.next().charAt(0);
        System.out.println("yaşınızı girin :");
        int yaş = scanner.nextInt();

        if (cinsiyet == 'K') {
            if (yaş > 60) {
            System.out.print("prim gununuzu giriniz : ");

                int primGun = scanner.nextInt();
                if (primGun > 6000) {
                    System.out.println("tebrikler emekli oldunuz haydi torun sevmeye :)");
                } else System.out.println("emekliliğiniz için =" + (6000 - primGun) + "yatırmanız lazım");
            } else System.out.println("emekliliğinize daha :" + (60 - yaş) + "yıl daha var");
        } else if (cinsiyet == 'E') {
            if (yaş > 65) {
                System.out.print("prim gununu giriniz : ");
                int primGun = scanner.nextInt();
                if (primGun > 7000) {
                    System.out.println("emekli oldunuz");
                } else System.out.println("emekliliğiniz için =" + (7000 - primGun) + "yatırmanız lazım");
            } else System.out.println("emekliliğinize daha :" + (65 - yaş) + "yıl daha var");
        }else {
            System.out.println("ne oldugunu gir ");

        }


    }
}
