package day04;

import java.util.Scanner;

public class Q13_StringManipultion {
    public static void main(String[] args) {

        // Kullanicidan 4 harfli bir kelime isteyin
// ve girilen kelimeyi tersten yazdirin

        Scanner scanner=new Scanner(System.in);
        System.out.println("4 harfli bir kelime giriniz : ");
        String kelime=scanner.nextLine();

        System.out.println(kelime.substring(3) +kelime.substring(2,3) +kelime.substring(1,2)+kelime.substring(0,1));







    }
}
