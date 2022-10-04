package javatask1;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {

        /*
 Task->
 Girilen iki kelimeden ilki çift sayıda karakter içeriyorsa 2. kelimeyi 1. kelimenin ortasına print eden
 ilk kelime tek sayıda karakter içeriyorsa "kelime2 kelime1 eklenemez" print eden code create ediniz
 name1= mehmet
 name2= ahmet
 Print ==> mehahmetmet
 */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Bir kelime giriniz : ");
        String str1=scanner.nextLine();
        System.out.println("Bir kelime daha giriniz :");
        String str2=scanner.nextLine();

        if (str1.length()%2==0) {
            System.out.println(str1.substring(0, str1.length() / 2) + str2 + str1.substring(str1.length() / 2));
        }else{
            System.out.println("str1 str2 eklenemez");
        }



















    }
}
