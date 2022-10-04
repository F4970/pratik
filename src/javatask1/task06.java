package javatask1;

import java.util.Scanner;

public class task06 {
    public static void main(String[] args) {


        /* Girilen stringin son karakterini silen code create ediniz ...

         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("String girin : ");
        String str1=scanner.nextLine();

        System.out.println(str1.substring(0, str1.length() - 1));


    }
}
