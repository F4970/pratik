package day05;

import java.util.Scanner;

public class Q02_MethodCreation {
    public static void main(String[] args) {

        /* Write a method named isEven that accepts an integer argument.
 The method should return true if the argument is even, or false otherwise.*/

      Scanner scanner=new Scanner(System.in);
        System.out.println("Bir sayı girin : ");
        int sayı = scanner.nextInt();

        isEven(sayı);
        System.out.println(isEven(sayı));

    }

    public static boolean isEven (int sayı) {
        return sayı%2==0 ? true : false ;
    }

}
