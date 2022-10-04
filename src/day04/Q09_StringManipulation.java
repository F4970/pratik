package day04;

import java.util.Scanner;

public class Q09_StringManipulation {
    public static void main(String[] args) {
        /*
name1 ve name2 degiskenlerini olusturun.
name1 degiskeninin karakter sayisi cift ise kelimenin ortasina name2 yi yerlestirin.
name1 degiskeninin karakter sayisi tek ise "name1 cift sayili olmadigi icin ortasina yerlestiremedik" yazdirin.
          e.g:
         name1= mehmet
         name2= ahmet
         Print ==> mehahmetmet
*/

        Scanner scanner=new Scanner(System.in);
        System.out.println("name 1 : ");
        String name1=scanner.next().toLowerCase();
        System.out.println("name 2 :");
        String name2=scanner.next().toLowerCase();

        if (name1.length()%2==0) {
            System.out.println(name1.substring(0,name1.length()/2) + name2 + name1.substring(name1.length()/2));
        }else {
            System.out.println("name1 cift sayili olmadigi icin ortasina yerlestiremedik");
        }










    }
}
