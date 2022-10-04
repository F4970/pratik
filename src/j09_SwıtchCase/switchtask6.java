package j09_SwıtchCase;

import java.util.Scanner;

public class switchtask6 {
    public static void main(String[] args) {

        // VIP (Very Important Person) kisaltmasinda harflerin kelime karşılığını print eden code create ediniz


        Scanner scanner=new Scanner(System.in);
        System.out.println("Kelimeyi giriniz : ");
        String kelime=scanner.nextLine();
        char harf=scanner.next().toUpperCase().charAt(0);

         switch (harf) {
             case 'V':
                 System.out.println("Very");
                 break;
             case 'I':
                 System.out.println("Important");
                 break;
             case 'P':
                 System.out.println("Person");
                 break;
             default:
                 System.out.println("Lütfen istenilen VIP kelimesinde öğrenmek istediğiniz harfi giriniz");
         }










    }
}
