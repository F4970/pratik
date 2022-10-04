package j10_StringManipulations;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {

        // TASK : Kullanıcıdan alacağınız bir stringde boşluk karakterinin olup olmadığını kontrol ediniz.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir kelime giriniz : ");
        String cümle = scanner.nextLine();

        System.out.println(cümle.contains(" "));


    }
}
