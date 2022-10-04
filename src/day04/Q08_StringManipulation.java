package day04;

import java.util.Scanner;

public class Q08_StringManipulation {
    public static void main(String[] args) {

// soru: "   Java ogrenmek123 Cok guzel@      " Stringini "Java ogrenmek cok guzel" seklinde yazdirin.

        String s=    "   Java ogrenmek123 Cok guzel@      ";

        System.out.println(s = s.replaceAll("\\d", "")); //Java ogrenmek Cok guzel@
        System.out.println(s.replace(("@"), "")); // Java ogrenmek Cok guzel
        System.out.println(s.replace("C", "c")); // Java ogrenmek cok guzel
        System.out.println(s.trim()); //


    }
}
