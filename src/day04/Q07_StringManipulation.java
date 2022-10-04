package day04;

import java.util.Scanner;

public class Q07_StringManipulation {
    public static void main(String[] args) {

        /*
         * girilen String icinde "xyz" dizimi var ise true degilse false return eden metod yaziniz
         *
         * input      output
         * axyzm  ==   true
         * xyz    ==   true
         * x.yz   ==   false
         * xyaz   ==   false
         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter String");
        String kelime=scanner.nextLine();

        if(kelime.contains("xyz")){
            System.out.println(true);
        }else{
            System.out.println(false);
        }













    }
}
