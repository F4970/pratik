package day01;

import java.util.Scanner;

public class Q08_Scanner {
    public static void main(String[] args) {
        //kullanıcıdan 2 tam sayı alın
        //bu tam sayıları toplayın ve sonucu yazdırın

        Scanner scanner=new Scanner(System.in);
        System.out.print("bir tam sayı girin : ");
        int sayi1=scanner.nextInt();
        System.out.print("bir tam sayı daha girin : ");
        int sayi2=scanner.nextInt();
        
        int sum= sayi1+sayi2;
        System.out.println("sum = " + sum);

    }
}
