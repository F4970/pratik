package j10_StringManipulations;

import java.util.Scanner;

public class Stringtask11 {
    public static void main(String[] args) {

        /* TASK :
       Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
       ad ayrı soyad ayrı sekilde ekrana yazdırınız.
       */


        Scanner scanner =new Scanner(System.in);

        System.out.println("adınız ve soyadınızı giriniz : ");

        String ad =scanner.next().toLowerCase();
        String soyad=scanner.next().toLowerCase();

        System.out.println(ad +'\n'+ soyad);























    }
}
