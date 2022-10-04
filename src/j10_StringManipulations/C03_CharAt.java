package j10_StringManipulations;

import java.util.Scanner;

public class C03_CharAt {
    public static void main(String[] args) {

        String şehir ="Istanbul";
        System.out.println("sehir.charAt(5)" + şehir.charAt(5)); //sehir.charAt(5)=b
        char beşinciİndexKrkt= şehir.charAt(5);
        System.out.println(beşinciİndexKrkt); //b

        //son index karakteri lenght() -1

        System.out.println(şehir.charAt(0)); //I

        System.out.println(şehir.charAt(18)); //rte
        //index boyutunu geçerde rte verir

        // İstanbul izmir girilen kelimenın ortadaki karakteri print eden code create edin

        Scanner scanner=new Scanner(System.in);
        System.out.println("bir kelime gir");
        String kelime=scanner.nextLine();

        if (kelime.length()%2!=0) {
            System.out.println(kelime.charAt((kelime.length() / 2)));
        }else System.out.println("girilen karakterin orta karakteri yoktur");

        }












    }

