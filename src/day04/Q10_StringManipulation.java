package day04;

import java.util.Scanner;

public class Q10_StringManipulation {
    public static void main(String[] args) {
/*
  Kullanicidan bir kelime girmesini isteyin.
  * Sozcukte tek sayida karakter ve 3 veya daha fazla karakter iceriyorsa,
  * kelimenin ortasindaki karakteri yazdirin.
  */


        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir kelime giriniz : ");
        String kelime = scanner.next().toLowerCase();
        char ortanca = kelime.charAt((kelime.length() - 1) / 2);

        if (kelime.length() % 2 != 0) {
            if (kelime.length() >= 3) {
                System.out.println(ortanca);
            }else {
                System.out.println("tek sayıda karakter içeren kelime giriniz");
            }

        }
    }
}
















