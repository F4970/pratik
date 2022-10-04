package javatask1;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {

        /*
        girilen string içindeki istenen indexdeki karakteri print eden cod create ediniz.
         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("String girin : ");

        String str=scanner.next();
        System.out.println("index gir :");
        int index=scanner.nextInt();

        if (str.length()>index) {
            System.out.println(str.charAt(index));
        }else {
            System.out.println("girdiğiniz metinde olmayan index istiyorsunuz");

        }


    }
}
