package day04;

import java.util.Locale;
import java.util.Scanner;

public class Q01_StringManipulation {
    public static void main(String[] args) {

        
//Kullanicidan ismini ve soyisimi girmesini isteyin, sonrasinda konsola tam ismini buyuk harfler ile yazdirin 

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen isminizi ve soyisminizi giriniz : ");
        String firstname=scanner.nextLine() , lastname=scanner.nextLine();
        
        String fulname= firstname.concat(""+lastname).toUpperCase();
        System.out.println("fulname = " + fulname);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
