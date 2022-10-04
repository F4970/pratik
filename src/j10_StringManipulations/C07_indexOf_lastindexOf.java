package j10_StringManipulations;

import java.util.Scanner;

public class C07_indexOf_lastindexOf {
    public static void main(String[] args) {

/* indexOf()
 * char karakter ya da String metnin kacinci indexden basladigini veren bir method dur. Sonuc integer dir.
 * Bu method index'i sorulan char'in String icindeki ilk gorunumunun index'ini return eder
  contains den farkı indexini verir, contains ise true false

 */
        String str = "Good";
        System.out.println("ilk görülen o 'nun yeri index no su :" + str.indexOf('o')); //1
        System.out.println("ilk görülen o 'nun yeri index no su :" + str.indexOf("d")); //3
        System.out.println("ilk görülen o 'nun yeri index no su :" + str.indexOf("D")); //D karakteri olmadığı için : -1

        // Olmayan karakter indexi sorgulanırsa -1 return eder.


        System.out.println("od 'nun yeri index no su :" + str.indexOf("od")); //2
        System.out.println("od 'nun yeri index no su :" + str.indexOf("Od")); // -1


/** lastIndexOf()
 *  String içinde aranan karakter(ler)in sondan itibaren ilk indexini verır
 *  indexOf un sondan olan hali fakat index numaraları değişmez.
 *  lastIndexOf() Method'u index'i sorulan character'in son gorunumunun index'ini return eder.
 *  indexOf() methodunda birden fazla character'in index'i sorulursa ilk character'in index'i return edilir.
 */

 String isim ="mustafa nizamoğlu";
        System.out.println(isim.indexOf('a')); //4
        System.out.println(isim.lastIndexOf('a')); //11
        System.out.println(isim.lastIndexOf("fa")); //5
        System.out.println(isim.indexOf("fa")); //5

        /*
task
 Girilen cümlenin aşaıdaki durumları sağlayacak code create ediniz

 1-Girilen cumle java icermiyor
 2-Girilen cumle 1 tane java iceriyor
 3-Girilen cumlede birden fazla java var
 */


        Scanner scanner=new Scanner(System.in);
        System.out.println("Bir cümle giriniz : ");
        String kelime=scanner.nextLine().toLowerCase();

        if (kelime.indexOf("java")==-1) {
            System.out.println("Girilen cümle java içermiyor");
        }else if (kelime.indexOf("java")== kelime.lastIndexOf("java")) {
            System.out.println("Girilen cümle 1 tane java içeriyor.");
        }else {
            System.out.println("Girilen cümlede birden fazla java var");






        }




    }
}
