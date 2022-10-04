package j08_ifStatement_TernaryOperator;

public class ifst4 {

    public static void main(String[] args) {

        /*  90.25 ve 90.25 değerinde iki double oluşturun.
        Eğer ilk double, ikinci double'dan büyükse  "Hello World" yazdırın.
        Eğer ilk double, ikinci double'dan küçükse "Not Hello World" yazdırın.
        Aksi halde (else) "I love java" yazdırın. */

     // double birinci= 90.25;
     // double ikinci=90.25;

     // if (birinci>ikinci) {
     //     System.out.println("Hello World");
     // } else if (birinci<ikinci) {
     //     System.out.println("Not Hello World");
     // } else{
     //     System.out.println("I love java ");

        //TERNARY ÇOZUMU

       double birinci= 90.25;
       double ikinci=90.25;

        System.out.println(birinci>ikinci ? "Hello World" : birinci<ikinci ? "Not Hello World " : "I Love Java" );

        }
    }

