package day04;

import java.util.Scanner;

public class Q02_StrinManipulation {
    public static void main(String[] args) {


//Scanner kullanarak iki ayri deger giriniz ve bu iki kelimeyi method kullanarak birlestiriniz.

//yukardaki ornekte verilen ilk ve ikinci degiskenlerinin ilk harflerini atip birlestiriniz.

        Scanner scanner=new Scanner(System.in);
        System.out.println("String 1 : ");
        String str1=scanner.nextLine();
        System.out.println("String 2 : ");
        String str2=scanner.nextLine();

        System.out.println("1.method ile birleşim : " +str1 + " "+str2);
        System.out.println("2.method ile birleşim : " + str1.concat(""+str2));


       String str1ilksiz = str1.substring(1);
       String str2ilksiz= str2.substring(1);

        System.out.println("ilk harfler olmadan birleşimi : "+ str1ilksiz+ " "+ str2ilksiz);











    }
}
