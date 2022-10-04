package day04;

import java.util.Scanner;

public class Q12_StringManipulation {
    public static void main(String[] args) {

        // Kullanicidan alacaginiz bir stringde bosluk karakterinin olup olmadigini kontrol ediniz.
// Kullanicidan alacaginiz bir stringin bos olup olmadigini kontrol ediniz.

        Scanner scanner = new Scanner(System.in);
        System.out.println("String ifade girin : ");
        String kelime = scanner.nextLine();

        System.out.println(kelime.contains(" "));

    }

    }
