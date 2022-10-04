package j08_ifStatement_TernaryOperator;

public class C01_ifStatement {
    public static void main(String[] args) {

        int krmYas=33;
        int ismlYas=40;
        if (krmYas==ismlYas) {
            System.out.println("aynı yaştasınız güzel insanlar");
            System.out.println("yoksa siz ikiz misiniz ? ");

        }
        if (krmYas>=40) System.out.println("krm bey olgunluk yaşındasınız");


        if (krmYas+ismlYas>100) {
            System.out.println("kerm bey ve ismail bey yaşları toplamı 100 den buyuk");
        }
            System.out.println("selam javacanlar");

        //ctrl+alt+l = code reformat java format

        /*
        Bağımsız if statement yapıları sadece kendi scop(kapsamlarını) run eder.
        Birden fazla bağımsız if statement yapıları hepsinin budy çalışabileceği gibi hiçbirisini bosyde çalışmayabilir.
         */

        }
    }

